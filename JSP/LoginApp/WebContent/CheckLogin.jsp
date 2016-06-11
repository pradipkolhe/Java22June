<%
	String name=request.getParameter("user");
	String pass=request.getParameter("pass");
	if(name.equals("ABC") && pass.equals("ABC")){
		//response.sendRedirect("Welcome.jsp");
		RequestDispatcher dis=request.getRequestDispatcher("Welcome.jsp");
		dis.forward(request, response);
	}
	else{
		response.sendRedirect("Login.jsp?err=Invalid User Name or password");
	}

%>