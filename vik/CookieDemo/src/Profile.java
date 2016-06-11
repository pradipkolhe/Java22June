

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Profile")
public class Profile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		Cookie ck[] =  request.getCookies();
		out.println("<html>");
		out.println("<body>");
		if(ck != null){
			RequestDispatcher rd  = request.getRequestDispatcher("index.html");
			rd.include(request, response);
			out.print("<br>");
			 out.println("welcome to profile:"+ck[0].getValue());
			
		}else{
			
            out.println("Login First");
			
			RequestDispatcher rd  = request.getRequestDispatcher("login.html");
			rd.include(request, response);
		}
		
		out.println("</body>");
		out.println("</html>");
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
