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
	<!-- insert into StudInfo values(8,"QQQQQ","000000","QQQ@gmail.com") -->
	<s:update dataSource="${c}" var="count">
		insert into StudInfo values(8,"QQQQQ","000000","QQQ@gmail.com")
	</s:update>
	
	Total Rows Inserted : <c:out value="${count}"></c:out>
</body>
</html>