import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class FirseServlet extends GenericServlet {

	String ename;
	@Override
	public void init(ServletConfig conf){
		ename="shyam";
		System.out.println("from init");
	}
	@Override
	public void service(ServletRequest req, ServletResponse resp)
			throws ServletException, IOException {
		
		int fno = Integer.parseInt(req.getParameter("fno"));
		
		int  sno =Integer.parseInt(req.getParameter("sno"));
		
		int n3 = fno+sno;
		
		PrintWriter out = resp.getWriter();
		
		out.println("<html>");
		
		out.println("<body>");
		
		out.println("<form action='fs'>");
		
		out.println("fno:<input type='text' name='fno' value='"+fno+"'/><br>");
		
		out.println("fno:<input type='text' name='sno' value='"+sno+"'/><br>");
		
		out.println("<input type='submit' name='submit' value='add'/>");
		
		out.println("</form>");
		out.println("</body>");
		
		out.println("</html>");
		
		out.print("Result:"+n3);
				
		
		
	}
	
	@Override
	public void destroy(){
		
		System.out.println("from destroy");
		ename=null;
	}
	
	

}
