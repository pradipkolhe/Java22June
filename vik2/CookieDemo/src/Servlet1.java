

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Servlet1() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

         PrintWriter out = response.getWriter();
		  String name = request.getParameter("name");
		  
		  Cookie ck = new Cookie("uname", name);
		  
		  response.addCookie(ck);
		  
		  out.print("welcome:"+name);
		  out.print("<br>");
		  out.println("<form action='Servlet2'>");
		  out.println("<input type='submit' name='submit' value='go'/>");
		  out.println("</form>");
		
	}

}
