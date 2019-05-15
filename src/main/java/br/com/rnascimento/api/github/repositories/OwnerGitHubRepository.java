package br.com.rnascimento.api.github.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.rnascimento.api.github.entities.OwnerGitHubEntity;

@Repository
public interface OwnerGitHubRepository extends JpaRepository<OwnerGitHubEntity, Long>{

}