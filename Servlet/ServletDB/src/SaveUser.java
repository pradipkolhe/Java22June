

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SaveUser extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("user");
		String contact=request.getParameter("contact");
		String email=request.getParameter("email");
		String pass=request.getParameter("pass");
		System.out.println("name : "+name);
		System.out.println("Contact : "+contact);
		System.out.println("Email : "+email);
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentInfo","root","root");
			PreparedStatement st=con.prepareStatement("insert into Student(name,contact,email,pass) values(?,?,?,?)");
			st.setString(1, name);
			st.setString(2, contact);
			st.setString(3, email);
			st.setString(4, pass);
			int rowCont=st.executeUpdate();
			if(rowCont>0){
				response.sendRedirect("Home?msg=Student Register successfully......");
			}
			else{
				response.sendRedirect("Home?msg=Student registration Fail........");
			}
			st.close();
			con.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
