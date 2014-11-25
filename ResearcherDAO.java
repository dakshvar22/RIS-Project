import java.lang.*;
import java.util.List;

public interface ResearcherDAO {
	public Researcher getResearcherByKey(int studentId);
	public String updateProjectKey(int studentId,int projectId,String key);
	public String searchProj(String key);
	//public void getAllProjs();
	//public void addresearcher(researcher res);
	// public void updateStudent(Student student);
	// public void deleteStudent(Student student);
}

