package br.com.rnascimento.api.github.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rnascimento.api.github.dtos.RepositoryGitHubDTO;
import br.com.rnascimento.api.github.entities.RepositoryGitHubEntity;
import br.com.rnascimento.api.github.facades.GitHubFacade;
import br.com.rnascimento.api.github.repositories.GitHubRepository;
import br.com.rnascimento.api.github.utils.ModelMapperUtil;

@Service
public class GitHubService {
	
	@Autowired
	private GitHubFacade gitHubFacade;
	
	@Autowired
	private GitHubRepository gitHubRepository;

	public void buscarRepositoriosGitHub() {
		List<RepositoryGitHubDTO> listaTop5Repositories = this.gitHubFacade.buscarRepositoriosGitHub();
		List<RepositoryGitHubEntity> listaGithubEntity = ModelMapperUtil.converter(listaTop5Repositories, RepositoryGitHubEntity.class);
		
		for(RepositoryGitHubEntity repositoryGitHub : listaGithubEntity) {
			this.gitHubRepository.save(repositoryGitHub);
		}
	}

}
