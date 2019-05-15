package br.com.rnascimento.api.github.responses.git;

import java.io.Serializable;
import java.util.List;

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
public class GitHubResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8398438781583801207L;

	@JsonProperty("total_count")
	public Long totalCount;
	
	@JsonProperty("incomplete_results")
	public boolean incompleteResults;
	
	@JsonProperty("items")
	public List<ItemGitHubResponse> items;
}
