//package jdbc;

public class Department {
	int dnum;
	String dname;
	//Professor hod;
	public Department(){
		dnum=0;
		dname=null;
		//hod=null;
	}
	public int getDnum() {
		return dnum;
	}
	public void setDnum(int dnum) {
		this.dnum = dnum;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	/*public Professor getHod() {
		return hod;
	}
	public void setHod(Professor hod) {
		this.hod = hod;
	}*/
}
