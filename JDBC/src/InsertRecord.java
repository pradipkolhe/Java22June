import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class InsertRecord {

	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.jdbc.Driver");//Register Driver
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentDB", "root", "root");//create connection
			Statement st=c.createStatement();//Create statement
			int count=st.executeUpdate("insert into  StudInfo(sid,name,contact,email) values(1,'ABC','98769678','abc@gmail.com')");
			st.close();
			c.close();
			System.out.println(count+ " rows affected");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
