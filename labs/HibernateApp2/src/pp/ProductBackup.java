package pp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ProductBackupDb")
public class ProductBackup {
	
	@Id
	@Column(name="pId")
	private int prodId;
	
	@Column(name="pName",length=20)
	private String prodName;
	
	@Column(name="pDesc",length=20)
	private String prodDesc;
	
	
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String getProdDesc() {
		return prodDesc;
	}
	public void setProdDesc(String prodDesc) {
		this.prodDesc = prodDesc;
	}
	public ProductBackup() {
		super();
	}
	
	
}
