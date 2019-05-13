package br.com.rnascimento.api.github.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rnascimento.api.github.facades.GitHubFacade;

@Service
public class GitHubService {
	
	@Autowired
	private GitHubFacade gitHubFacade;

	public void buscarRepositoriosGitHub() {
		this.gitHubFacade.buscarRepositoriosGitHub();
	}

}
