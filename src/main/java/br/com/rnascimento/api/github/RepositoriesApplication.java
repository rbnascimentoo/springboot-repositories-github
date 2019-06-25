package br.com.rnascimento.api.github;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class RepositoriesApplication {
	
	private static final Logger LOG = LogManager.getLogger();

	public static void main(String[] args) {
		LOG.info("### Iniciando o serviço... ###");
		SpringApplication.run(RepositoriesApplication.class, args);
	}

}