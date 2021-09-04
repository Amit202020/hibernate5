package pp;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="album")
public class Album {
	
	@Id
	@Column(name="aid")
	private int aid;
	
	@Column(name="aname",length=10)
	private String aname;
	
	@OneToMany(cascade=CascadeType.ALL)
	List<Photo> photoes;
	
	public List<Photo> getPhotoes() {
		return photoes;
	}
	public void setPhotoes(List<Photo> photoes) {
		this.photoes = photoes;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public Album() {
		super();
	}
	
	

}
