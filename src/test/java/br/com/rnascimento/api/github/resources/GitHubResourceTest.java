package br.com.rnascimento.api.github.resources;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.rnascimento.api.github.dtos.RepositoryGitHubDTO;
import br.com.rnascimento.api.github.services.GitHubService;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class GitHubResourceTest {
	
	@Autowired
	private TestRestTemplate restTemplate;
	
	@Mock
	private GitHubService gitHubService;
	
	@Test
	public void deveObterTodosRepositories() {
		List<RepositoryGitHubDTO> repositoryGitHubDTOList = Arrays.asList(RepositoryGitHubDTO.builder().id(1L).build(), 
				RepositoryGitHubDTO.builder().id(2L).build());
		BDDMockito.when(this.gitHubService.obterTodosRepositoriosGitHub()).thenReturn(repositoryGitHubDTOList);
		ResponseEntity<String> response = this.restTemplate.getForEntity("/github/obterTodos", String.class);
		Assert.assertEquals(response.getStatusCodeValue(), 200);
	}
	
	@Test
	public void devObterRepositoryPorId() {
		Long id = 1L;
		RepositoryGitHubDTO repositoryGitHubDTO = RepositoryGitHubDTO.builder().id(id).build();
		BDDMockito.when(this.gitHubService.obterPorIdRepositoriosGitHub(id)).thenReturn(repositoryGitHubDTO);
		ResponseEntity<String> response = this.restTemplate.getForEntity("/github/" + id, String.class);
		Assert.assertEquals(response.getStatusCodeValue(), 200);
	}

}