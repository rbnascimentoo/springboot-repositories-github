package br.com.rnascimento.api.github.dtos;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
public class OwnerGitHubDTO implements Serializable {

	public String login;
	public Long id;
	public String nodeId;
	public String avatarUrl;
	public String gravatarId;
	public String url;
	public String htmlUrl;
	public String followersUrl;
	public String followingUrl;
	public String gistsUrl;
	public String starredUrl;
	public String subscriptionsUrl;
	public String organizationsUrl;
	public String reposUrl;
	public String eventsUrl;
	public String receivedEventsUrl;
	public String type;
	public boolean siteAdmin;
}