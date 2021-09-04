package pp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="qtrouser")
public class Trouser  extends Clothing {
	
	@Column(name="qgender",length=10)
    private String gender;

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Trouser() {
		super();
	}
      
}
