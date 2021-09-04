package pp;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="clothingdb")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="ctype",length=10,discriminatorType=DiscriminatorType.STRING)
public class Clothing {
	
	 @Id
	 @Column(name="gid")
     private int id;
	 
	 @Column(name="gcolor",length=10)
     private String color;
	 
	 @Column(name="gsize")
     private int size;
     
     
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public Clothing() {
		super();
	}
     
     
}
