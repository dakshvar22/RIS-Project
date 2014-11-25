import java.sql.*;
public class DAO_ris {
	public static void main(String[] args) {
		try{
			DAO_Factory daoFactory = new DAO_Factory();

			daoFactory.activateConnection();

			researcherDAO rdao = daoFactory.getresearcherDAO();
			researcher r = rdao.getresearcherByKey(2);
			r.print();
			//rdao.updateProjectKey(2,1,"Data Structures");
			rdao.searchProj("Algorithms");
			daoFactory.deactivateConnection();
		}catch(Exception e){
				//Handle errors for Class.forName
				e.printStackTrace();
		}
	}//end main
}//end FirstExample
