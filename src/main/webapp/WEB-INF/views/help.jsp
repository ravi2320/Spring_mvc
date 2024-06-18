<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help Page</title>
</head>
<body>
	<%
		String name = (String) request.getAttribute("name");
		LocalDateTime time = (LocalDateTime) request.getAttribute("time");
	%>
	<h1>This is help Page</h1>
	<h1>My name is <%= name %></h1>
	<h1>Time : <%=time.toString() %></h1>
</body>
</html>