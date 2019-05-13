package br.com.rnascimento.api.github.responses.git;

import java.math.BigDecimal;

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
public class ItemGitHubResponse {

	@JsonProperty("id")
	public Long id;
	
	@JsonProperty("node_id")
	public String nodeId;
	
	@JsonProperty("name")
	public String name;
	
	@JsonProperty("full_name")
	public String fullName;
	
	@JsonProperty("private")
	public boolean _private;
	
	@JsonProperty("owner")
	public OwnerGitHubResponse owner;
	
	@JsonProperty("html_url")
	public String htmlUrl;
	
	@JsonProperty("description")
	public String description;
	
	@JsonProperty("fork")
	public boolean fork;
	
	@JsonProperty("url")
	public String url;
	
	@JsonProperty("forks_url")
	public String forksUrl;
	
	@JsonProperty("keys_url")
	public String keysUrl;
	
	@JsonProperty("collaborators_url")
	public String collaboratorsUrl;
	
	@JsonProperty("teams_url")
	public String teamsUrl;
	
	@JsonProperty("hooks_url")
	public String hooksUrl;
	
	@JsonProperty("issue_events_url")
	public String issueEventsUrl;
	
	@JsonProperty("events_url")
	public String eventsUrl;
	
	@JsonProperty("assignees_url")
	public String assigneesUrl;
	
	@JsonProperty("branches_url")
	public String branchesUrl;
	
	@JsonProperty("tags_url")
	public String tagsUrl;
	
	@JsonProperty("blobs_url")
	public String blobsUrl;
	
	@JsonProperty("git_tags_url")
	public String gitTagsUrl;
	
	@JsonProperty("git_refs_url")
	public String gitRefsUrl;
	
	@JsonProperty("trees_url")
	public String treesUrl;
	
	@JsonProperty("statuses_url")
	public String statusesUrl;
	
	@JsonProperty("languages_url")
	public String languagesUrl;
	
	@JsonProperty("stargazers_url")
	public String stargazersUrl;
	
	@JsonProperty("contributors_url")
	public String contributorsUrl;
	
	@JsonProperty("subscribers_url")
	public String subscribersUrl;
	
	@JsonProperty("subscription_url")
	public String subscriptionUrl;
	
	@JsonProperty("commits_url")
	public String commitsUrl;
	
	@JsonProperty("git_commits_url")
	public String gitCommitsUrl;
	
	@JsonProperty("comments_url")
	public String commentsUrl;
	
	@JsonProperty("issue_comment_url")
	public String issueCommentUrl;
	
	@JsonProperty("contents_url")
	public String contentsUrl;
	
	@JsonProperty("compare_url")
	public String compareUrl;
	
	@JsonProperty("merges_url")
	public String mergesUrl;
	
	@JsonProperty("archive_url")
	public String archiveUrl;
	
	@JsonProperty("downloads_url")
	public String downloadsUrl;
	
	@JsonProperty("issues_url")
	public String issuesUrl;
	
	@JsonProperty("pulls_url")
	public String pullsUrl;
	
	@JsonProperty("milestones_url")
	public String milestonesUrl;
	
	@JsonProperty("notifications_url")
	public String notificationsUrl;
	
	@JsonProperty("labels_url")
	public String labelsUrl;
	
	@JsonProperty("releases_url")
	public String releasesUrl;
	
	@JsonProperty("deployments_url")
	public String deploymentsUrl;
	
	@JsonProperty("created_at")
	public String createdAt;
	
	@JsonProperty("updated_at")
	public String updatedAt;
	
	@JsonProperty("pushed_at")
	public String pushedAt;
	
	@JsonProperty("git_url")
	public String gitUrl;
	
	@JsonProperty("ssh_url")
	public String sshUrl;
	
	@JsonProperty("clone_url")
	public String cloneUrl;
	
	@JsonProperty("svn_url")
	public String svnUrl;
	
	@JsonProperty("homepage")
	public String homepage;
	
	@JsonProperty("size")
	public Long size;
	
	@JsonProperty("stargazers_count")
	public Long stargazersCount;
	
	@JsonProperty("watchers_count")
	public Long watchersCount;
	
	@JsonProperty("language")
	public String language;
	
	@JsonProperty("has_issues")
	public boolean hasIssues;
	
	@JsonProperty("has_projects")
	public boolean hasProjects;
	
	@JsonProperty("has_downloads")
	public boolean hasDownloads;
	
	@JsonProperty("has_wiki")
	public boolean hasWiki;
	
	@JsonProperty("has_pages")
	public boolean hasPages;
	
	@JsonProperty("forks_count")
	public Long forksCount;
	
	@JsonProperty("mirror_url")
	public String mirrorUrl;
	
	@JsonProperty("archived")
	public boolean archived;
	
	@JsonProperty("disabled")
	public boolean disabled;
	
	@JsonProperty("open_issues_count")
	public Long openIssuesCount;
	
	@JsonProperty("license")
	public LicenseGitHubResponse license;
	
	@JsonProperty("forks")
	public Long forks;
	
	@JsonProperty("open_issues")
	public Long openIssues;
	
	@JsonProperty("watchers")
	public Long watchers;
	
	@JsonProperty("default_branch")
	public String defaultBranch;
	
	@JsonProperty("score")
	public BigDecimal score;
}
