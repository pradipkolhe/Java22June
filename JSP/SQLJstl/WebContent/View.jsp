<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="s" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<s:setDataSource var="c" driver="com.mysql.jdbc.Driver"
				url="jdbc:mysql://localhost:3306/Student"
				user="root"
				password="root"
	/>
	
	<s:query dataSource="${c}" var="rs" sql="select * from studInfo;"></s:query>
	<table border="2" height="300" width="300">
	<th>
		<tr>
			<td>ID</td>
			<td>Name</td>
			<td>Contact</td>
			<td>Email</td>
		</tr>
	</th>
	<c:forEach var="d" items="${rs.rows}">
		<tr>
			<td><c:out value="${d.sid}"></c:out></td>
			<td><c:out value="${d.name}"></c:out></td>
			<td><c:out value="${d.contact}"></c:out></td>
			<td><c:out value="${d.email}"></c:out></td>
		<tr/>
	</c:forEach>
	</table>
</body>
</html>