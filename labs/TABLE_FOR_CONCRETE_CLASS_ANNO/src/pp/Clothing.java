package pp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="qclothing")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Clothing {
	
	 @Id
	 @Column(name="qid")
     private int id;
	 
	 @Column(name="qcolor",length=10)
     private String color;
	 
	 @Column(name="qsize")
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
