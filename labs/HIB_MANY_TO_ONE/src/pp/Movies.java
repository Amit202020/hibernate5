package pp;

public class Movies {
	
	private int mid;
	private String mname;
	
	Actor ac=new Actor();

	public Actor getAc() {
		return ac;
	}
	public void setAc(Actor ac) {
		this.ac = ac;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public Movies() {
		super();
	}
	

}
