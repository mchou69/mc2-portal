package mc.com;
// Generated 13 nov. 2018 10:20:54 by Hibernate Tools 5.2.10.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Categories generated by hbm2java
 */
@Entity
@Table(name = "categories")
public class Categories implements java.io.Serializable {

	private int id;
	private String category;
	private Set<Posts> postses = new HashSet<Posts>(0);

	public Categories() {
	}

	public Categories(int id, String category) {
		this.id = id;
		this.category = category;
	}

	public Categories(int id, String category, Set<Posts> postses) {
		this.id = id;
		this.category = category;
		this.postses = postses;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "category", nullable = false, length = 45)
	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "categories")
	public Set<Posts> getPostses() {
		return this.postses;
	}

	public void setPostses(Set<Posts> postses) {
		this.postses = postses;
	}

}