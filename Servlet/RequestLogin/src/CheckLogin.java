import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class CheckLogin extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		PrintWriter out=res.getWriter();
		String name=req.getParameter("user");
		String password=req.getParameter("pass");
		if(name.equals("ABC") && password.equals("pass")){
			/*res.sendRedirect("valid");*/
			RequestDispatcher dis=req.getRequestDispatcher("valid");
			dis.forward(req,res);
		}
		else{
			res.sendRedirect("invalid");
		}
	}
	
	
}