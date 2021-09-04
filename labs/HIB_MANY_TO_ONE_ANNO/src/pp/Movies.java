package pp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="movies")
public class Movies {
	
	@Id
	@Column(name="mid")
	private int mid;
	
	@Column(name="mname",length=10)
	private String mname;
	
	@ManyToOne
	Actor ac=new Actor();

	public Actor getAc() {
		return ac;
	}
	public void setAc(Actor ac) {
		this.ac = ac;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public Movies() {
		super();
	}
	

}
