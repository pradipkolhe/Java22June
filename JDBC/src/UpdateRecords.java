import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;


public class UpdateRecords {

	public static void main(String[] args) {
		try{
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentDB","root","root");
			Statement st=c.createStatement();
			int count=st.executeUpdate("update studInfo set email='xtz@yahoo.com' where sid=2");
			st.close();
			c.close();
			System.out.println(count +" rows updated");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
