import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class First extends HttpServlet {
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init()");
	}
	
	@Override
		protected void service(HttpServletRequest arg0, HttpServletResponse arg1)
				throws ServletException, IOException {
			System.out.println("service()");
		}
	@Override
		public void destroy() {
			System.out.println("destroy()");	
		}
}
