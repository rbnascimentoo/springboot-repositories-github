package br.com.rnascimento.api.github.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.rnascimento.api.github.entities.RepositoryGitHubEntity;

@Repository
public interface GitHubRepository extends JpaRepository<RepositoryGitHubEntity, Long>{

}
