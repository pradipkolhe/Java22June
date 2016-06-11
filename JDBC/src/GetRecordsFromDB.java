import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class GetRecordsFromDB {

	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/Student","root","root");
			Statement st=c.createStatement();
				//select * from StudInfo;
				ResultSet rs=st.executeQuery("select * from StudInfo;");
				System.out.println("Id \t\t Name \t\t contact \t\t Email");
				while(rs.next()){
					System.out.print(rs.getInt("sid")+"\t\t");
					System.out.print(rs.getString("name")+"\t\t");
					System.out.print(rs.getString("contact")+"\t\t");
					System.out.print(rs.getString("email")+"\n");
				}
			st.close();
			c.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
