<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% 
		String error=request.getParameter("err");
		if(error!=null) {
			out.println(error);
		}
	%>
	<form action="CheckLogin.jsp" method="post">
		Enter User Name : <input type="text" name="user"/><br/>
		Enter Password : <input type="password" name="pass"/><br/>
		<input type="submit" value="Login"/><br/> 
	</form>
</body>
</html>