package pp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="addtab")
public class Address {
	
	@Id
	@Column(name="lineNo")
    private int lineNo;
	
	@Column(name="city",length=10)
    private String city;
      
   
	public int getLineNo() {
		return lineNo;
	}
	public void setLineNo(int lineNo) {
		this.lineNo = lineNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Address() {
		super();
	}
      
      
      
}
