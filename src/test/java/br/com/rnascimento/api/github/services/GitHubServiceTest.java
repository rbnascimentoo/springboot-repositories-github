package br.com.rnascimento.api.github.services;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.rnascimento.api.github.dtos.RepositoryGitHubDTO;
import br.com.rnascimento.api.github.entities.RepositoryGitHubEntity;
import br.com.rnascimento.api.github.facades.GitHubFacade;
import br.com.rnascimento.api.github.repositories.RepositoryGitHubRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GitHubServiceTest {

	@InjectMocks
	private GitHubService gitHubService;

	@Mock
	private RepositoryGitHubRepository gitHubRepository;
	
	@Mock
	private GitHubFacade gitHubFacade;

	@Test
	public void obterTodosRepositoryGitHub() {
		Mockito.when(this.gitHubRepository.findAll()).thenReturn(
				Arrays.asList(RepositoryGitHubEntity.builder().id(1L).name("Repository GitHub Test").build()));
		List<RepositoryGitHubDTO> listGitHubRepositoryDTO = this.gitHubService.obterTodosRepositoriosGitHub();
		Mockito.verify(this.gitHubRepository).findAll();
		Assert.assertThat(listGitHubRepositoryDTO, CoreMatchers.notNullValue());
	}

	@Test
	public void buscarSalvarRepositoriosGitHub() {
		
	}

	@Test
	public void obterPorIdRepositoriosGitHub() {
		Optional<RepositoryGitHubEntity> user = Optional
				.of(RepositoryGitHubEntity.builder().id(1L).name("Repository GitHub Test").build());
		Mockito.when(this.gitHubRepository.findById(1L)).thenReturn(user);
		RepositoryGitHubDTO repositoryGitHubDTO = this.gitHubService.obterPorIdRepositoriosGitHub(1L);
		Mockito.verify(this.gitHubRepository).findById(1L);
		Assert.assertThat(repositoryGitHubDTO, CoreMatchers.notNullValue());
	}

}
