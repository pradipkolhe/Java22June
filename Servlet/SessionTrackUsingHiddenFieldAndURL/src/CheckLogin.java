

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CheckLogin extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String un=request.getParameter("user");
		
		String pass=request.getParameter("pass");
		PrintWriter out=response.getWriter();
		if(un.equals("ABC") && pass.equals("ABC")){
			out.print("Welcoem User : "+un);
			out.print("<form action='Home'>");
			out.print("<input type='hidden' name='uname' value='"+un+"'>");
				out.print("<input type='submit' value='Go to Home'>");
			out.print("</form>");
		}
		else{
			response.sendRedirect("Login");
		}
	}

}
