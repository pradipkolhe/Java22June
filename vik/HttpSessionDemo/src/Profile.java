

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Profile
 */
@WebServlet("/Profile")
public class Profile extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession(false);
		out.println("<html>");
		out.println("<body>");
		if(session != null){
			RequestDispatcher rd  = request.getRequestDispatcher("index.html");
			rd.include(request, response);
			out.print("<br>");
			out.println("welcome to profile:"+session.getAttribute("name"));
			session.setMaxInactiveInterval(10);
		}else{
			
            out.println("Login First");
			
			RequestDispatcher rd  = request.getRequestDispatcher("login.html");
			rd.include(request, response);
		}
		
		out.println("</body>");
		out.println("</html>");
		
		
	}

}
