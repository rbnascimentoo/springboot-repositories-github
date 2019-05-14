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

	public List<RepositoryGitHubDTO> buscarRepositoriosGitHub() {
		ResponseEntity<GitHubResponse> top5Repositories = RestClient.getRestTemplateBuilder(RestPaths.API_GIT_HUB)
				.getForEntity(RestPaths.SEARCH_REPOSITORIES_GIT_HUB, GitHubResponse.class);
		return ModelMapperUtil.converter(top5Repositories.getBody().getItems(), RepositoryGitHubDTO.class);
	}

}
