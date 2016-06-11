import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Welcome extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		PrintWriter out=res.getWriter();
		String name=req.getParameter("user");
		out.print("Valids User.. Welcome, "+name);
	}
}
