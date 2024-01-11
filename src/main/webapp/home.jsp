<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>home</title>
</head>
<body>
	<%@ include file="navBar.jsp" %> //include navBar

	<%
	String userName = (String)session.getAttribute("userName");
	%>

	<div align="center">
	<h2>Task Management System</h2>
	<label>Welcome <%= userName %></label>
	</div>
	
</body>
</html>