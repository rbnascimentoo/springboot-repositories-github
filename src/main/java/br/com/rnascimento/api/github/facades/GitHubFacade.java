package br.com.rnascimento.api.github.facades;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import br.com.rnascimento.api.github.constants.RestPaths;
import br.com.rnascimento.api.github.dtos.RepositoryGitHubDTO;
import br.com.rnascimento.api.github.responses.git.GitHubResponse;
import br.com.rnascimento.api.github.rest.clients.RestClient;
import br.com.rnascimento.api.github.utils.ModelMapperUtil;

@Component
public class GitHubFacade {

	/**
	 * Faz a comunicação com a Api do GitHUb.
	 * Converte o response da comunicação para DTO.
	 * 
	 * @return List<RepositoryGitHubDTO>
	 */
	public List<RepositoryGitHubDTO> buscarRepositoriosGitHub(String language) {
		ResponseEntity<GitHubResponse> top5Repositories = RestClient.getRestTemplateBuilder(RestPaths.API_GIT_HUB)
				.getForEntity(RestPaths.SEARCH_REPOSITORIES_GIT_HUB + language + RestPaths.SEARCH_REPOSITORIES_GIT_HUB_ORDER, GitHubResponse.class);
		return ModelMapperUtil.converter(top5Repositories.getBody().getItems(), RepositoryGitHubDTO.class);
	}

}
