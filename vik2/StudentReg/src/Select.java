

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Select
 */
@WebServlet("/Select")
public class Select extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Select() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         
		 String no = request.getParameter("no");
		 int n1 = Integer.parseInt(no);
		  try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","root");
		
			PreparedStatement pstmt = con.prepareStatement("select * from student where sno=?");
		  
			 pstmt.setInt(1, n1);
			 
			 ResultSet rs = pstmt.executeQuery();
			 PrintWriter out = response.getWriter();
			 
			 while(rs.next()){
				 
				 out.println(rs.getInt(1)+"<br>"+
				 
				             rs.getString(2)+"<br>"+
				             
				             rs.getString(3)+"<br>"+
				             
				             rs.getString(4)
				);
			 }
		  
		  
		  } catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
