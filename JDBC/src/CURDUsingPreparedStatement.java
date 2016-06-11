import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class CURDUsingPreparedStatement {
	public static void main(String[] args) {
		while(true){
			System.out.println("1 : save Info");
			System.out.println("2 : Display Info");
			System.out.println("3 : Update Info");
			System.out.println("4 : Delete Info");
			System.out.println("5 : Exit");
			Scanner scan=new Scanner(System.in);
			System.out.println("Select Choice : ");
			int ch=scan.nextInt();
			switch(ch){
				case 1 : {
					CURDUsingPreparedStatement test=new CURDUsingPreparedStatement();
					test.save();
					break;
				}
				case 2 : {
					CURDUsingPreparedStatement test=new CURDUsingPreparedStatement();
					test.display();
					break;
				}
				case 3 : {
					CURDUsingPreparedStatement test=new CURDUsingPreparedStatement();
					test.update();
					break;
				}
				case 4 : {
					CURDUsingPreparedStatement test=new CURDUsingPreparedStatement();
					test.delete();				
					break;
				}
				case 5 : {
					System.exit(0);
					break;
				}
				default : {
					System.out.println("Invalid Input");
				}
			}
		
		}
	}
	public void save(){
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
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
			PreparedStatement st=c.prepareStatement("insert into StudInfo(sid,name,contact,email) values(?,?,?,?);");
			st.setInt(1, id);
			st.setString(2, name);
			st.setString(3, contact);
			st.setString(4, email);
			int count=st.executeUpdate();
			st.close();
			c.close();
			System.out.println(count+ " rows affected");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	public void display(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/Student","root","root");
			PreparedStatement st=c.prepareStatement("select * from StudInfo;");
				//select * from StudInfo;
				ResultSet rs=st.executeQuery();
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
	public void update(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
			PreparedStatement st=c.prepareStatement("update studInfo set email=? where sid=?;");
			st.setInt(2, 4);
			st.setString(1, "pqr@gmail.com");
			int count=st.executeUpdate();
			st.close();
			c.close();
			System.out.println(count+ " rows affected");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	public void delete(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
			PreparedStatement st=c.prepareStatement("delete from studInfo where sid=?;");
			st.setInt(1, 4);
			int count=st.executeUpdate();
			st.close();
			c.close();
			System.out.println(count+ " rows affected");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
