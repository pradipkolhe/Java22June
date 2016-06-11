import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class InsertDynamicVal {
	public static void main(String[] args) {
		try{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter Student Id : ");
			int id=s.nextInt();
			System.out.println("Enter Student Name : ");
			String name=s.next();
			System.out.println("Enter Student Contact : ");
			String contact=s.next();
			System.out.println("Enter Student Email : ");
			String email=s.next();
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/Student","root","root");
			Statement st=c.createStatement();
			st.executeUpdate("insert into studinfo(sid,name,contact,email) values("+id+",'"+name+"','"+contact+"','"+email+"')");
			st.close();
			c.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}
}
