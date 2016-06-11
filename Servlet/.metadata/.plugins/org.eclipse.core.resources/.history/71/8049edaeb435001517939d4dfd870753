

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Home extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String name="";
		Cookie c[]=request.getCookies();
		for(Cookie ck : c){
			if(ck.getName().equals("user")){
				name=ck.getValue();
			}
		}
		out.print("Welcome User : "+name);
	}

}
