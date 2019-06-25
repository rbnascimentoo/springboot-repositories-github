package br.com.rnascimento.api.github.rest.clients;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;

public class RestClient {

	/**
	 * Faz chamada a api através da URL passada.
	 * 
	 * @param url
	 * @return
	 */
	public static RestTemplate getRestTemplateBuilder(String url) {
		return new RestTemplateBuilder().rootUri(url).build();
	}
}