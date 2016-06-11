

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestdispatchDemo
 */
@WebServlet("/RequestdispatchDemo")
public class RequestdispatchDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		PrintWriter out = response.getWriter();
		
		out.println("from httpdemo");
		
		RequestDispatcher rd= request.getRequestDispatcher("Example");
		
		rd.include(request, response);
	}

	

}
