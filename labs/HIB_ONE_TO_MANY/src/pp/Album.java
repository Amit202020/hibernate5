package pp;

import java.util.List;

public class Album {
	
	private int aid;
	private String aname;
	
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
