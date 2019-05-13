package br.com.rnascimento.api.github.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rnascimento.api.github.services.GitHubService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "user")
@RestController
@RequestMapping(value = "/")
public class GitHubResource {

	@Autowired
	private GitHubService gitHubService;
	
	@ApiOperation(value = "Find all users.")
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public void buscarRepositoriosGitHub() {
		this.gitHubService.buscarRepositoriosGitHub();
		
	}
	
}