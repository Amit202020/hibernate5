package pp;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("SH")
public class Shirt extends Clothing {

	@Column(name="gfit")
	private int fit;

	public int getFit() {
		return fit;
	}

	public void setFit(int fit) {
		this.fit = fit;
	}

	public Shirt() {
		super();
	}
	
	
	  
	  
}
