import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Display extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
			System.out.println("inside Display Servlet");
			String msg=req.getParameter("msgTxt");
			String nm=req.getParameter("username");
			PrintWriter out=res.getWriter();
			out.println("Welcome , "+nm+". Your Message : "+msg);
	}
}
