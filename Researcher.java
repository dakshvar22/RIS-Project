import java.lang.*;
import java.util.ArrayList;
import java.util.List;
public class Researcher {
	int studentId;
	String fname;
	String lname;
	String address;
	String loginId;
	String password;
	char sex;
	//int dept_num;
	Department dpt;
	ArrayList<String> skills;
	//ArrayList<Project> projs;
	public Researcher(){
		studentId=0;
		fname=null;
		lname = null;
		address=null;
		loginId=null;
		password=null;
		sex=' ';
		dpt=new Department();
		skills=new ArrayList<String>();
		//projs=new ArrayList<Project>();
	}
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
		return loginId;
	}
	public void setLoginid(String loginid) {
		this.loginId = loginId;
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
	public Department getDept() {
		return this.dpt;
	}
	public void setDept(int dpt) {
		this.dpt.setDnum(dpt);
	}
	public ArrayList<String> getSkills(){
		return skills;
	}
	public void setSkill(String sk){
		this.skills.add(sk);
	}
	/*public ArrayList<Project> getProjects(){
		return this.projs;
	}
	public void setProject(Project p)
	{
		this.projs.add(p);
	}*/
	public void print()
	{ 
		System.out.println("StudentId=" + studentId); 
		System.out.println("name=" + (fname+" "+lname));
	}
}
