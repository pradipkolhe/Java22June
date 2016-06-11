

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

 
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String name = request.getParameter("name");
		
	PrintWriter out = response.getWriter();
		
	out.print("welcome:"+name);
		
	out.println("<br>");
		
	out.println("<form action='Servlet2'>");
		
	out.print("<input type='hidden' name='name' value='"+ name+ "'/>");
	
	out.print("<input type='submit' name='submit' value='go'/>");
	
	out.print("</form>");
	}

	

}