

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		ServletConfig config=getServletConfig();
		String head=config.getInitParameter("head");
		out.println("<html>");
			out.println("<head>");
				out.println("<title>Login Page</title");
			out.println("</head>");
			
			out.println("<body>");
			out.println("<h2>"+head+"</h2>");
			String errMsg=request.getParameter("err");
			if(errMsg!=null){
				out.println(errMsg);
			}
				out.println("<form action='CheckLogin' method='post'>");
					out.println("Enter User Name : <input type='text' name='user'/><br/>");
					out.println("Enter Password : <input type='password' name='pass'/><br/>");
					out.println("<input type='submit' value='Login'/>");
				out.println("</form>");
				ServletContext ctx=getServletContext();
				String reg=ctx.getInitParameter("register");
				out.println("<h3>"+reg+"</h3>");
			out.println("</body>");
		out.println("</html>");
	}

}