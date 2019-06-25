package br.com.rnascimento.api.github.services;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import br.com.rnascimento.api.github.dtos.RepositoryGitHubDTO;
import br.com.rnascimento.api.github.entities.LicenseGitHubEntity;
import br.com.rnascimento.api.github.entities.RepositoryGitHubEntity;
import br.com.rnascimento.api.github.facades.GitHubFacade;
import br.com.rnascimento.api.github.repositories.LicenseGitHubRepository;
import br.com.rnascimento.api.github.repositories.OwnerGitHubRepository;
import br.com.rnascimento.api.github.repositories.RepositoryGitHubRepository;
import br.com.rnascimento.api.github.utils.ModelMapperUtil;

@Service
public class GitHubService {
	
	private static final Logger LOG = LogManager.getLogger();
	
	@Autowired
	private GitHubFacade gitHubFacade;
	
	@Autowired
	private RepositoryGitHubRepository gitHubRepository;
	
	@Autowired
	private OwnerGitHubRepository ownerGitHubRepository;
	
	@Autowired
	private LicenseGitHubRepository licenseGitHubRepository;

	/**
	 *  Busca Repositorios GitHub
	 */
	@CacheEvict(allEntries = true, value = {"findAll", "findById"}, beforeInvocation = true)
	public void buscarRepositoriosGitHub(String language) {
		
		if(ObjectUtils.isEmpty(language)) {
			return;
		}
		
		//Solução Temporária//
		LOG.info("### Deletando repositories existêntes ###");
		this.gitHubRepository.deleteAll();
		this.licenseGitHubRepository.deleteAll();
		this.ownerGitHubRepository.deleteAll();
		//Solução Temporária//
		
		LOG.info("### Buscando o TOP 5 repositories do github ###");
		List<RepositoryGitHubEntity> listaGithubEntity = ModelMapperUtil.converter(
				this.gitHubFacade.buscarRepositoriosGitHub(language), RepositoryGitHubEntity.class);
		
		LOG.info("### Salvando na base o TOP 5 repositories do github ###");
		
		for(RepositoryGitHubEntity repositoryGitHub : listaGithubEntity) {
			this.ownerGitHubRepository.save(repositoryGitHub.getOwner());
			this.salvarLicenseRepositoy(repositoryGitHub.getLicense());
			this.gitHubRepository.save(repositoryGitHub);
		}
		LOG.info("### Dados salvos na base ###");
	}

	private void salvarLicenseRepositoy(LicenseGitHubEntity licenseGitHubGitHub) {
		if(licenseGitHubGitHub != null) {
			this.licenseGitHubRepository.save(licenseGitHubGitHub);
		}
	}

	/**
	 * Obtem TOP 5 Repositorios GitHub já salvos na base.
	 * @return
	 */
	@Cacheable("findAll")
	public List<RepositoryGitHubDTO> obterTodosRepositoriosGitHub() {
		LOG.info("### Listando o TOP 5 repositories ###");
		
		List<RepositoryGitHubEntity> list = this.gitHubRepository.findAll();
		//Ordena os itens da lista de acordo com a quantidade de estrelas recebidas.
		list.sort(Comparator.comparing(RepositoryGitHubEntity::getStargazersCount).reversed());
		
		return ModelMapperUtil.converter(list, RepositoryGitHubDTO.class);
	}

	/**
	 * Obtém Por Id Repositorios GitHub já salvo na base.
	 * 
	 * @param id
	 * @return
	 */
	@Cacheable("findById")
	public RepositoryGitHubDTO obterPorIdRepositoriosGitHub(Long id) {
		LOG.info("### Obtendo o repository por Id ###");
		RepositoryGitHubDTO repositoryGitHubDTO = new RepositoryGitHubDTO();
		Optional<RepositoryGitHubEntity> repositoryGitHubEntity = this.gitHubRepository.findById(id);
		if(repositoryGitHubEntity.isPresent()) {
			repositoryGitHubDTO = ModelMapperUtil.converter(repositoryGitHubEntity.get(), RepositoryGitHubDTO.class);
		}
		return repositoryGitHubDTO;
	}

}
