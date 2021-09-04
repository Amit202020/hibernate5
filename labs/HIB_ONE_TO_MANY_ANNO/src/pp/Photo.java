package pp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="photo")
public class Photo {
	
	@Id
	@Column(name="pid")
	private int pid;
	
	@Column(name="pname",length=10)
	private String pname;
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Photo() {
		super();
	}
	
	

}
