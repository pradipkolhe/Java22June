

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name =request.getParameter("name");
		
		String pwd = request.getParameter("pwd");
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		if(pwd.equals("admin")){
			
			Cookie ck = new Cookie("user",name);
			
			response.addCookie(ck);
			RequestDispatcher rd  = request.getRequestDispatcher("index.html");
			rd.include(request, response);
			
			out.print("<br>");
			out.println(name+",Login successFul...!");
		}else{
			
			out.println("InCorrect Password");
			
			RequestDispatcher rd  = request.getRequestDispatcher("login.html");
			rd.include(request, response);
			
		}
		out.println("</body>");
		out.println("</html>");
	}

	

}
