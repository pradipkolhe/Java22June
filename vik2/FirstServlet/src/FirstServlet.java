import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class FirstServlet extends GenericServlet {
    
	String ename;
	@Override
     
     
  	public void init(ServletConfig conf){
		ename="shyam";
    	 System.out.println("from init");
		
	}
	@Override
	public void service(ServletRequest req, ServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = resp.getWriter();
		
         String fno=req.getParameter("fno");
		
		String sno = req.getParameter("sno");
		
		String opt = req.getParameter("submit");
		
		try{
		
		
		
		int n1 = Integer.parseInt(fno);
		
		int n2 = Integer.parseInt(sno);
		
		int n3 =0;
		
		if(opt.equals("add")){
			
			n3= n1+n2;
			
		}else if(opt.equals("mult")){
			
			
			n3=n1*n2;
		}else if(opt.equals("div")){
			
			
			n3=n1/n2;
		}
		pw.println("<html>");
		
		pw.println("<html>");
		pw.println("<body>");
		pw.println("<form action='fs'>");
		pw.println(" FNO:<input type='text' name = 'fno' value='"+fno+"'/>  <br>");
		pw.println(" FNO:<input type='text' name = 'sno' value='"+sno+"'/>  <br>");
		pw.println("<input type = 'submit' name = 'submit' value ='add'/>");
		pw.println("<input type = 'submit' name = 'submit' value ='mult'/>");
		pw.println("<input type = 'submit' name = 'submit' value ='div'/><br>");
		pw.println("</form>");
		pw.println("</body>");
		pw.println("</html>");
		pw.println("Result:"+n3);
		
		}catch(NumberFormatException e){
			pw.println("<html>");
			pw.println("<body>");
			pw.println("<form action='fs'>");
			pw.println(" FNO:<input type='text' name = 'fno' value='"+fno+"'/>  <br>");
			pw.println(" FNO:<input type='text' name = 'sno' value='"+sno+"'/>  <br>");
			pw.println("<input type = 'submit' name = 'submit' value ='add'/>");
			pw.println("<input type = 'submit' name = 'submit' value ='mult'/>");
			pw.println("<input type = 'submit' name = 'submit' value ='div'/>");
			pw.println("</form>");
			pw.println("</body>");
			pw.println("</html>");
			pw.print("Pass Only Integer Values");
		}catch (ArithmeticException e) {
			pw.println("<html>");
			pw.println("<body>");
			pw.println("<form action='fs'>");
			pw.println(" FNO:<input type='text' name = 'fno' value='"+fno+"'/>  <br>");
			pw.println(" FNO:<input type='text' name = 'sno' value='"+sno+"'/>  <br>");
			pw.println("<input type = 'submit' name = 'submit' value ='add'/>");
			pw.println("<input type = 'submit' name = 'submit' value ='mult'/>");
			pw.println("<input type = 'submit' name = 'submit' value ='div'/>");
			pw.println("</form>");
			pw.println("</body>");
			pw.println("</html>");
			pw.print("dont pass 2nd value as Zero");
			// TODO: handle exception
		}
		
	}
	
	@Override
	public void destroy(){
		ename=null;
		System.out.println("from destroy");
	}

}
