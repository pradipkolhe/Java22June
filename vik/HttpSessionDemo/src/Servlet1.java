

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		String name =request.getParameter("name");
		
		PrintWriter out = response.getWriter();
		
		out.println("welcome:"+name);
		
		HttpSession session = request.getSession();
		
		session.setAttribute("name", name);
		session.invalidate();
		out.println("<form action='Servlet2'>");
		
	    out.print("<input type='submit' name='submit' value='go'/>");
		
		out.print("</form>");
	}

}
