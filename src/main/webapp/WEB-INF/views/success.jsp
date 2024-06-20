<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>${ Header }</h1>
	<h1>${ Desc }</h1>
	<center><h1 style="color:green">${ msg }</h1></center>
	<hr>
	<h1>Email : <%-- ${ email } --%> ${ user.email }</h1>
	<h1>Username: <%-- ${ name } --%>${ user.username }</h1>
	<h1>Password : <%-- ${ pass} --%>${ user.password }</h1>
	
</body>
</html>