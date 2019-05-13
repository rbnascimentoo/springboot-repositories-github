package br.com.rnascimento.api.github.responses.git;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class LicenseGitHubResponse {

	@JsonProperty("key")
	public String key;
	
	@JsonProperty("name")
	public String name;
	
	@JsonProperty("spdx_id")
	public String spdxId;
	
	@JsonProperty("url")
	public String url;
	
	@JsonProperty("node_id")
	public String nodeId;
}
