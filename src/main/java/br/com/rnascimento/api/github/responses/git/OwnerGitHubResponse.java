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
public class OwnerGitHubResponse {

	@JsonProperty("login")
	public String login;
	
	@JsonProperty("id")
	public Long id;
	
	@JsonProperty("node_id")
	public String nodeId;
	
	@JsonProperty("avatar_url")
	public String avatarUrl;
	
	@JsonProperty("gravatar_id")
	public String gravatarId;
	
	@JsonProperty("url")
	public String url;
	
	@JsonProperty("html_url")
	public String htmlUrl;
	
	@JsonProperty("followers_url")
	public String followersUrl;
	
	@JsonProperty("following_url")
	public String followingUrl;
	
	@JsonProperty("gists_url")
	public String gistsUrl;
	
	@JsonProperty("starred_url")
	public String starredUrl;
	
	@JsonProperty("subscriptions_url")
	public String subscriptionsUrl;
	
	@JsonProperty("organizations_url")
	public String organizationsUrl;
	
	@JsonProperty("repos_url")
	public String reposUrl;
	
	@JsonProperty("events_url")
	public String eventsUrl;
	
	@JsonProperty("received_events_url")
	public String receivedEventsUrl;
	
	@JsonProperty("type")
	public String type;
	
	@JsonProperty("site_admin")
	public boolean siteAdmin;

}
