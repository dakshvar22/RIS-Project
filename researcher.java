import java.lang.*;
import java.util.ArrayList;
import java.util.List;
public class researcher {
	int studentId;
	String fname;
	String lname;
	String address;
	String loginid;
	String password;
	char sex;
	int dept_num;
	ArrayList<String> skills = new ArrayList<String>();
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getLoginid() {
		return loginid;
	}
	public void setLoginid(String loginid) {
		this.loginid = loginid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public int getDeptNo() {
		return dept_num;
	}
	public void setDeptNo(int deptNo) {
		this.dept_num = dept_num;
	}
	public ArrayList<String> getSkills(){
		return skills;
	}
	public void setSkill(String sk){
		this.skills.add(sk);
	}
	public void print()
	{ 
		System.out.println("StudentId=" + studentId); 
		System.out.println("name=" + (fname+" "+lname));
	}
}
