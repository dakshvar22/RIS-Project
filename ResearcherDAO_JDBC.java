import java.util.ArrayList;
import java.util.List;
import java.sql.*;


public class ResearcherDAO_JDBC implements ResearcherDAO {
	
	Connection dbConnection;

	public ResearcherDAO_JDBC(Connection dbconn){
		// JDBC driver name and database URL
 		//  Database credentials
		dbConnection = dbconn;
	}

	@Override
	public Researcher getResearcherByKey(int studentId) {
		Researcher r = new Researcher();
		String sql;
		Statement stmt = null;
		int researchCheck=0;
		try{
			stmt = dbConnection.createStatement();
			sql = "select * from researcher where studentId="+studentId;
			//STEP 5: Extract data from result set
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				researchCheck=1;
				//Retrieve by column name
				int rollno  = rs.getInt("studentId");
				if(rollno!=studentId)
					continue;
				String fname = rs.getString("fname");
				String lname = rs.getString("lname");
				//String loginid = rs.getString("loginid");
				String address = rs.getString("address");
				String sex = rs.getString("sex");
				int dept_num=rs.getInt("dept_num");
				r.setStudentId(studentId);
				r.setFname(fname);
				r.setLname(lname);
				r.setAddress(address);
				r.setSex(sex.charAt(0));
				r.setDept(dept_num);
				// Add exception handling here if more than one row is returned
			}
		} catch (SQLException ex) {
		    // handle any errors
		    System.out.println("SQLException: " + ex.getMessage());
		    System.out.println("SQLState: " + ex.getSQLState());
		    System.out.println("VendorError: " + ex.getErrorCode());
		}
		// Add exception handling when there is no matching record
		if(researchCheck==0)
		{
			return null;
		}
		else
			return r;
	}

	@Override
	public String updateProjectKey(int studentId,int projectId,String key)
	{
		String sql;
		Statement stmt = null;
		int projectCheck=0;
		String out=null;
		try{
			stmt = dbConnection.createStatement();
			sql = "select projNo from works_on where resId="+studentId;
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next())
			{
				int projId = rs.getInt("projNo");
				if(projId==projectId)
				{
					projectCheck = 1;
					break;
				}
			}
		}catch (SQLException ex) {
				System.out.println("SQLException: " + ex.getMessage());
				System.out.println("SQLState: " + ex.getSQLState());
				System.out.println("VendorError: " + ex.getErrorCode());
		}
		if(projectCheck==0)
		{
			//System.out.println("You are not working on this project\n");
			out="You are not working on this project\n";
			//return projectCheck;
		}
		else
		{
		    PreparedStatement preparedStatement=null;
			sql = "insert into projectkey(projectId,keyword) values (?,?)";

			try {
				preparedStatement = dbConnection.prepareStatement(sql);
	 
				preparedStatement.setInt(1, projectId);
				preparedStatement.setString(2, key);
	 
				// execute insert SQL stetement
				preparedStatement.executeUpdate();
	 
				//System.out.println("Keyword: " + key + " added to the projectId: "+ projectId);
				out="Keyword: " + key + " added to the projectId: "+ projectId;
			} catch (SQLException e) {
	 			System.out.println(e.getMessage());
	 		}

			try{
				if (preparedStatement != null) {
					preparedStatement.close();
					
					//return projectCheck;
				}
			} catch (SQLException e) {
	 			System.out.println(e.getMessage());
	 		}
		}
		return out;
	}
	
	@Override
	public String searchProj(String key)
	{
		String sql;
		Statement stmt = null;
		int projectCheck=0;
		String output="";
		try{
			stmt = dbConnection.createStatement();
			sql = "select distinct projectId from projectkey where keyword='"+key+"'";
			//System.out.println(sql);
			ResultSet rs = stmt.executeQuery(sql);
			if(!rs.next())
			{
				//System.out.println("No project with such keyword found");
				output="No project with such keyword found";
			}
			while(rs.next())
			{
				int id = rs.getInt("projectId");
				//System.out.println(id);
				Statement stmt2=null;
				String sql2;
				try
				{
					stmt2 = dbConnection.createStatement();
					sql2 = "select * from project where projId="+id;
					ResultSet rs2 = stmt2.executeQuery(sql2);
					String name="";
					while(rs2.next())
						name = rs2.getString("name");
					//System.out.println("Project id: "+id+"\nName: "+name);
					output="Project id: "+id+"\nName: "+name;
				}
				catch (SQLException ex) 
				{
		    // handle any errors
					System.out.println("SQLException: " + ex.getMessage());
					System.out.println("SQLState: " + ex.getSQLState());
					System.out.println("VendorError: " + ex.getErrorCode());
				}
			}
			
		}
		catch (SQLException ex) {
		    // handle any errors
				System.out.println("SQLException: " + ex.getMessage());
				System.out.println("SQLState: " + ex.getSQLState());
				System.out.println("VendorError: " + ex.getErrorCode());
		}
		return output;
	}
}
	/*public void addresearcher(Student student) {
		PreparedStatement preparedStatement = null;																																																																																																																																													
		String sql;
		sql = "insert into student(rollno, name) values (?,?)";

		try {
			preparedStatement = dbConnection.prepareStatement(sql);
 
			preparedStatement.setInt(1, student.getRollno());
			preparedStatement.setString(2, student.getName());
 
			// execute insert SQL stetement
			preparedStatement.executeUpdate();
 
			System.out.println("Student: Roll No " + student.getRollno() 
				+ ", added to the database");
		} catch (SQLException e) {
 			System.out.println(e.getMessage());
 		}

		try{
			if (preparedStatement != null) {
				preparedStatement.close();
			}
		} catch (SQLException e) {
 			System.out.println(e.getMessage());
 		}
	}*/
