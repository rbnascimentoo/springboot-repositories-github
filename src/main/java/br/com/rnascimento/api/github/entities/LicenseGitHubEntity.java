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
public class LicenseGitHubEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3193773153251120903L;
	
	@Id
	public String key;
	@Column
	public String name;
	@Column
	public String spdxId;
	@Column
	public String url;
	@Column
	public String nodeId;
}