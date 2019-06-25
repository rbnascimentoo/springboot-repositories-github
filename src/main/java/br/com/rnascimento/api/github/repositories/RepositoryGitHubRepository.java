package br.com.rnascimento.api.github.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.rnascimento.api.github.entities.RepositoryGitHubEntity;

@Repository
@Transactional(readOnly = true)
public interface RepositoryGitHubRepository extends JpaRepository<RepositoryGitHubEntity, Long> {

}