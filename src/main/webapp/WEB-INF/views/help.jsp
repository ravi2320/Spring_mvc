<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help Page</title>
</head>
<body>
	<%
		/* String name = (String) request.getAttribute("name");
		LocalDateTime time = (LocalDateTime) request.getAttribute("time"); */
	%>
	<h1>This is help Page</h1>
	<h1>My name is 
		<%-- <%= name %> --%>
		${ name }
	</h1>
	<h1>
		Time : 
		<%-- <%=time.toString() %> --%>
		${ time }
	</h1>
	<hr>
	<h1>Marks :</h1>
	<c:forEach var="item" items="${ marks }">
		<h1>${ item }</h1>
	</c:forEach>
</body>
</html>