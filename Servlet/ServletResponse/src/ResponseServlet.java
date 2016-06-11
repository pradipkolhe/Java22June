import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ResponseServlet extends HttpServlet {
	@Override
	public void init() throws ServletException {
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.print("Hello, Welocme to first response");
		out.print("<h1>Hello, Response using html tag</h1>");
		out.print("click here to <a href=''>Login</a>");
	}
	@Override
	public void destroy() {
	}
}
