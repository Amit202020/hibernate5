package pp;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="gtrouser")
public class Trouser  extends Clothing {
	
	@Column(name="gender",length=10)
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
