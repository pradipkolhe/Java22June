

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		
		out.println("<html>");
			out.println("<head>");
				out.println("<title>Message</title");
			out.println("</head>");
			
			out.println("<body>");
				out.println("<form action='CheckLogin' method='get'>");
					out.println("Enter User Name : <input type='text' name='user'/><br/>");
					out.println("Enter Password : <input type='password' name='pass'/><br/>");
					out.println("<input type='submit' value='Login'/>");
				out.println("</form>");
			out.println("</body>");
		out.println("</html>");
	}
}
