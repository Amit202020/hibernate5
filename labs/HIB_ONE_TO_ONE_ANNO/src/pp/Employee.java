package pp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="emptab")
public class Employee {
	
	@Id
	@Column(name="eId")
	private int empId;
	
	@Column(name="eName",length=10)
	private String empName;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="ADD_FK")
	private Address addr;
	
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Employee() {
		super();
	}
	
	

}
