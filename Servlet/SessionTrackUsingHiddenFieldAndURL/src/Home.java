

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Home extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String name=request.getParameter("uname");
		
		out.println("<center>");
		out.print("<h3> User , : "+name+"</h3>");
		out.println("<a href=''> | Profile | </a>");
		out.println("<a href='AbouUs?nm="+name+"'>  About Us | </a>");
		out.println("</center>");
	}

}
