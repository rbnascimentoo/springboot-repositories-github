package br.com.rnascimento.api.github.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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
public class RepositoryGitHubEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1666412385993567105L;
	
	@Id
	public Long id;
	@Column
	public String nodeId;
	@Column
	public String name;
	@Column
	public String fullName;
	@Column
	public boolean _private;
	@JoinColumn
	@OneToOne
	public OwnerGitHubEntity owner;
	@Column
	public String htmlUrl;
	@Column
	public String description;
	@Column
	public boolean fork;
	@Column
	public String url;
	@Column
	public String forksUrl;
	@Column
	public String keysUrl;
	@Column
	public String collaboratorsUrl;
	@Column
	public String teamsUrl;
	@Column
	public String hooksUrl;
	@Column
	public String issueEventsUrl;
	@Column
	public String eventsUrl;
	@Column
	public String assigneesUrl;
	@Column
	public String branchesUrl;
	@Column
	public String tagsUrl;
	@Column
	public String blobsUrl;
	@Column
	public String gitTagsUrl;
	@Column
	public String gitRefsUrl;
	@Column
	public String treesUrl;
	@Column
	public String statusesUrl;
	@Column
	public String languagesUrl;
	@Column
	public String stargazersUrl;
	@Column
	public String contributorsUrl;
	@Column
	public String subscribersUrl;
	@Column
	public String subscriptionUrl;
	@Column
	public String commitsUrl;
	@Column
	public String gitCommitsUrl;
	@Column
	public String commentsUrl;
	@Column
	public String issueCommentUrl;
	@Column
	public String contentsUrl;
	@Column
	public String compareUrl;
	@Column
	public String mergesUrl;
	@Column
	public String archiveUrl;
	@Column
	public String downloadsUrl;
	@Column
	public String issuesUrl;
	@Column
	public String pullsUrl;
	@Column
	public String milestonesUrl;
	@Column
	public String notificationsUrl;
	@Column
	public String labelsUrl;
	@Column
	public String releasesUrl;
	@Column
	public String deploymentsUrl;
	@Column
	public String createdAt;
	@Column
	public String updatedAt;
	@Column
	public String pushedAt;
	@Column
	public String gitUrl;
	@Column
	public String sshUrl;
	@Column
	public String cloneUrl;
	@Column
	public String svnUrl;
	@Column
	public String homepage;
	@Column
	public Long size;
	@Column
	public Long stargazersCount;
	@Column
	public Long watchersCount;
	@Column
	public String language;
	@Column
	public boolean hasIssues;
	@Column
	public boolean hasProjects;
	@Column
	public boolean hasDownloads;
	@Column
	public boolean hasWiki;
	@Column
	public boolean hasPages;
	@Column
	public Long forksCount;
	@Column
	public String mirrorUrl;
	@Column
	public boolean archived;
	@Column
	public boolean disabled;
	@Column
	public Long openIssuesCount;
	@JoinColumn
	@OneToOne
	public LicenseGitHubEntity license;
	@Column
	public Long forks;
	@Column
	public Long openIssues;
	@Column
	public Long watchers;
	@Column
	public String defaultBranch;
	@Column
	public BigDecimal score;
	
}
