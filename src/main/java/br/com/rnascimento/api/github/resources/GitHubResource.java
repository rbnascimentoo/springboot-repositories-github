package br.com.rnascimento.api.github.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rnascimento.api.github.dtos.RepositoryGitHubDTO;
import br.com.rnascimento.api.github.responses.GenericResponse;
import br.com.rnascimento.api.github.services.GitHubService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "github")
@RestController
@RequestMapping(value = "/github")
public class GitHubResource {

	@Autowired
	private GitHubService gitHubService;
	
	@ApiOperation(value = "Busca todos os repositórios e salva-os na base.")
	@GetMapping(path ="/repository/{language}", produces = MediaType.APPLICATION_JSON_VALUE)
	public void buscarRepositoriosGitHub(@PathVariable(value = "language") String language) {
		this.gitHubService.buscarRepositoriosGitHub(language);
	}
	
	@ApiOperation(value = "Obtém todos os repositórios.")
	@GetMapping(path ="/obterTodos",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<GenericResponse<List<RepositoryGitHubDTO>>> obterTodosRepositoriosGitHub() {
		GenericResponse<List<RepositoryGitHubDTO>> response = new GenericResponse<List<RepositoryGitHubDTO>>();
		response.setData(this.gitHubService.obterTodosRepositoriosGitHub());
		return ResponseEntity.ok(response);
	}
	
	@ApiOperation(value = "Obtém o repositório por id.")
	@GetMapping(path ="/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<GenericResponse<RepositoryGitHubDTO>> obterPorIdRepositoriosGitHub(@PathVariable(value = "id") String id) {
		GenericResponse<RepositoryGitHubDTO> response = new GenericResponse<RepositoryGitHubDTO>();
		response.setData(this.gitHubService.obterPorIdRepositoriosGitHub(Long.valueOf(id)));
		return ResponseEntity.ok(response);
	}
	
}