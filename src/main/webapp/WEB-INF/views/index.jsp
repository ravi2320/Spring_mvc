<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<h1>This is home page</h1>
	<h1>Called by home controller</h1>
	<h1>url /home</h1>
	
	<%
		String name = (String) request.getAttribute("name");
		Integer id = (Integer)request.getAttribute("id");
		List<String> friends = (List<String>) request.getAttribute("f");
	%>
	
	<h1>Name is <%=name %></h1>
	<h1>Id is : <%=id %></h1>
	<h1>Fiends are : 
		<%
			for(String friend : friends){
		%>
		<%=friend %>
		<%		
			}
		%>
	</h1>
</body>
</html>