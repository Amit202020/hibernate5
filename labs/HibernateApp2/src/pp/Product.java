package pp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQuery(name="Product.byProdId",query="from Product where prodId=?")
@NamedNativeQuery(name="Product.byProductName",query="SELECT * FROM productdb WHERE pname=?",resultClass=Product.class)
@Table(name="ProductDb")
public class Product {
	
	@Id
	@Column(name="PID")
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
	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName
				+ ", prodDesc=" + prodDesc + "]";
	}
	public Product() {
		super();
	}

	
	
}
