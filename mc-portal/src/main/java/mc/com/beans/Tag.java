package mc.com.beans;
// Generated 13 nov. 2018 10:23:21 by Hibernate Tools 5.2.10.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Tags generated by hbm2java
 */
@Entity
@Table(name = "tags")
public class Tag implements java.io.Serializable {

	private int id;
	private String name;
	private Set<PostTag> postTags = new HashSet<PostTag>(0);

	public Tag() {
	}

	public Tag(int id) {
		this.id = id;
	}

	public Tag(int id, String name, Set<PostTag> postTags) {
		this.id = id;
		this.name = name;
		this.postTags = postTags;
	}

	public Tag(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "Title", length = 45)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tag")
	public Set<PostTag> getPostTags() {
		return this.postTags;
	}

	public void setPostTags(Set<PostTag> postTags) {
		this.postTags = postTags;
	}

}
