package pp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="qshirt")
public class Shirt extends Clothing {

	@Column(name="qfit")
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
