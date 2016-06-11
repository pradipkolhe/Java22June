

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Register extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		
		out.println("<html>");
			out.println("<head>");
				out.println("<title>Register Page</title");
			out.println("</head>");
			out.println("<body>");
				out.println("<form action='SaveUser' method='get'>");
					out.println("Enter User Name : <input type='text' name='user'/><br/>");
					out.println("Enter User Contact No. : <input type='text' name='contact'/><br/>");
					out.println("Enter User Email ID : <input type='text' name='email'/><br/>");
					out.println("Enter Password : <input type='password' name='pass'/><br/>");
					out.println("<input type='submit' value='Register'/>");
				out.println("</form>");
			out.println("</body>");
		out.println("</html>");
	}

}
