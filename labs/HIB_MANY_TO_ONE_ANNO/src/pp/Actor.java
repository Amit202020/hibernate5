package pp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Actor")
public class Actor {
	
	@Id
	@Column(name="aid")
	private int aid;
	
	@Column(name="aname",length=10)
	private String aname;

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

	public Actor() {
		super();
	}

}
