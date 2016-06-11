

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Welcome
 */
public class Welcome extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		HttpSession ss=request.getSession();
		String name=(String)ss.getAttribute("user");
		out.println("<center>");
		out.println("Welcome User: "+name);
		out.println("<a href='Home'> | Home |</a>");
		out.println("<a href='Logout'> Logout |</a>");
		out.println("</center>");
		ServletContext ctx=getServletContext();
		String reg=ctx.getInitParameter("register");
		out.println("<h3>"+reg+"</h3>");
	}

}
