import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Message extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		
		PrintWriter out=res.getWriter();
		out.println("<html>");
			out.println("<head>");
				out.println("<title>Message</title");
			out.println("</head>");
			out.println("<body>");
				out.println("<form action='dis'>");
					out.println("Enter message : <input type='text' name='msgTxt'/><br/>");
					out.println("Enter Name : <input type='text' name='username'/><br/>");
					out.println("<input type='submit' value='Send Msg'/>");
				out.println("</form>");
				
				out.println("<a href='dis'>Click to display</a>");
			out.println("</body>");
		out.println("</html>");
	}
}
