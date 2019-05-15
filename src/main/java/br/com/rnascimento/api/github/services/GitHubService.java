package br.com.rnascimento.api.github.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	public void buscarRepositoriosGitHub() {
		List<RepositoryGitHubEntity> listaGithubEntity = ModelMapperUtil.converter(
				this.gitHubFacade.buscarRepositoriosGitHub(), RepositoryGitHubEntity.class);
		
		for(RepositoryGitHubEntity repositoryGitHub : listaGithubEntity) {
			this.ownerGitHubRepository.save(repositoryGitHub.getOwner());
			this.salvarLicenseRepositoy(repositoryGitHub.getLicense());
			this.gitHubRepository.save(repositoryGitHub);
		}
	}

	private void salvarLicenseRepositoy(LicenseGitHubEntity licenseGitHubGitHub) {
		if(licenseGitHubGitHub != null) {
			this.licenseGitHubRepository.save(licenseGitHubGitHub);
		}
	}

	/**
	 * Obtem Todos Repositorios GitHub
	 * @return
	 */
	public List<RepositoryGitHubDTO> obterTodosRepositoriosGitHub() {
		return ModelMapperUtil.converter(this.gitHubRepository.findAll(), RepositoryGitHubDTO.class);
	}

	/**
	 * Obtém Por Id Repositorios GitHub
	 * 
	 * @param id
	 * @return
	 */
	public RepositoryGitHubDTO obterPorIdRepositoriosGitHub(Long id) {
		RepositoryGitHubDTO repositoryGitHubDTO = new RepositoryGitHubDTO();
		Optional<RepositoryGitHubEntity> repositoryGitHubEntity = this.gitHubRepository.findById(id);
		if(repositoryGitHubEntity.isPresent()) {
			repositoryGitHubDTO = ModelMapperUtil.converter(repositoryGitHubEntity.get(), RepositoryGitHubDTO.class);
		}
		return repositoryGitHubDTO;
	}

}
