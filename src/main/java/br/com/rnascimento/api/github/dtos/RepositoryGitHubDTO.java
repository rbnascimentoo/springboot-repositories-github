package br.com.rnascimento.api.github.dtos;

import java.io.Serializable;
import java.math.BigDecimal;

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
public class RepositoryGitHubDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4343873026252018206L;
	
	public Long id;
	public String nodeId;
	public String name;
	public String fullName;
	public boolean _private;
	public OwnerGitHubDTO owner;
	public String htmlUrl;
	public String description;
	public boolean fork;
	public String url;
	public String forksUrl;
	public String keysUrl;
	public String collaboratorsUrl;
	public String teamsUrl;
	public String hooksUrl;
	public String issueEventsUrl;
	public String eventsUrl;
	public String assigneesUrl;
	public String branchesUrl;
	public String tagsUrl;
	public String blobsUrl;
	public String gitTagsUrl;
	public String gitRefsUrl;
	public String treesUrl;
	public String statusesUrl;
	public String languagesUrl;
	public String stargazersUrl;
	public String contributorsUrl;
	public String subscribersUrl;
	public String subscriptionUrl;
	public String commitsUrl;
	public String gitCommitsUrl;
	public String commentsUrl;
	public String issueCommentUrl;
	public String contentsUrl;
	public String compareUrl;
	public String mergesUrl;
	public String archiveUrl;
	public String downloadsUrl;
	public String issuesUrl;
	public String pullsUrl;
	public String milestonesUrl;
	public String notificationsUrl;
	public String labelsUrl;
	public String releasesUrl;
	public String deploymentsUrl;
	public String createdAt;
	public String updatedAt;
	public String pushedAt;
	public String gitUrl;
	public String sshUrl;
	public String cloneUrl;
	public String svnUrl;
	public String homepage;
	public Long size;
	public Long stargazersCount;
	public Long watchersCount;
	public String language;
	public boolean hasIssues;
	public boolean hasProjects;
	public boolean hasDownloads;
	public boolean hasWiki;
	public boolean hasPages;
	public Long forksCount;
	public String mirrorUrl;
	public boolean archived;
	public boolean disabled;
	public Long openIssuesCount;
	public LicenseGitHubDTO license;
	public Long forks;
	public Long openIssues;
	public Long watchers;
	public String defaultBranch;
	public BigDecimal score;
}
