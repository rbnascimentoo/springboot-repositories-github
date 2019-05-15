package br.com.rnascimento.api.github.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Table
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class OwnerGitHubEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8864614153940329652L;
	
	@Id
	public Long id;
	@Column
	public String login;
	@Column
	public String nodeId;
	@Column
	public String avatarUrl;
	@Column
	public String gravatarId;
	@Column
	public String url;
	@Column
	public String htmlUrl;
	@Column
	public String followersUrl;
	@Column
	public String followingUrl;
	@Column
	public String gistsUrl;
	@Column
	public String starredUrl;
	@Column
	public String subscriptionsUrl;
	@Column
	public String organizationsUrl;
	@Column
	public String reposUrl;
	@Column
	public String eventsUrl;
	@Column
	public String receivedEventsUrl;
	@Column
	public String type;
	@Column
	public boolean siteAdmin;
	
}
