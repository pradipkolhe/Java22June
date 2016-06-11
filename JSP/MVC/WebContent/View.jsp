<%@page import="bean.Student"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h3>Student Information</h3><br/>
<a href="Register.jsp"> | Register |</a>
<a href="Home.jsp"> | Home |</a>
<table border="2" height="400" width="400">
<th>
	<tr>
		<td>ID</td>
		<td>Name</td>
		<td>Contact</td>
		<td>Email</td>
	</tr>
</th>
<%
	ArrayList<Student> studList=(ArrayList<Student>)request.getAttribute("studentList");
	for(Student s : studList)
	{
	%>
	<tr>
		<td><%out.print(s.getId()); %></td>
		<td><%out.print(s.getName());%></td>
		<td><%out.print(s.getContact());%></td>
		<td><%out.print(s.getEmail());%></td>
	</tr>
<%
	}

%>
</table>
</center>
</body>
</html>