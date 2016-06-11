

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		
		Cookie ck = new Cookie("uname", name);
		
		response.addCookie(ck);
		
		
		out.println("<html>");
		out.println("<body>");
		out.println("Welcome "+name);
		out.println("<form action='Servlet2'>");
		out.println("<input type='submit' name='submit' value='go'/>");
		out.println("</body>");
		out.println("</html>");
		
	}

}
