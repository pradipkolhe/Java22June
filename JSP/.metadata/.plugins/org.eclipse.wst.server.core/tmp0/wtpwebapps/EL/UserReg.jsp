<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<%@ include file="/Header.jsp" %>
<body>
	<form action="Display.jsp"> 
		Enter User Name :<input type="text" placeholder="Enter Name" name="name" required="required"><br/>
		Enter User Contact:<input type="text" name="contact" required="required"><br/>
		Enter User Email:<input type="text" name="email" required="required"><br/>
		Enter User Password:<input type="password" name="pass" required="required"><br/>
		<input type="submit" value="Save User">
	</form>
</body>
<%@ include file="/Footer.jsp" %>
</html>