

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddNumber extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		int n1=Integer.parseInt(request.getParameter("num1"));
		int n2=Integer.parseInt(request.getParameter("num2"));
		int add=n1+n2;
		request.setAttribute("addNum", add);
		RequestDispatcher dis=request.getRequestDispatcher("Display");
		dis.forward(request, response);
		/*out.print("Addition of "+n1+" and "+n2+" : "+(n1+n2));*/
	}

}
