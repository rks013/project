<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="dao.taskManagementDao"%>
<%@page import="com.Task"%>
<%@page import="java.util.*"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Product</title>
</head>
<body>
	<%@ include file="navBar.jsp" %>  

	<div align="center">
		<form action="AddingTask.jsp" method="post">
			<table class="productTable">
				<thead>
					<tr>
						<th colspan="2">
							Task Details
						</th>
					</tr>
				</thead>
				<tr>
					<td>Task ID</td>
					<td><input type="text" name="Id" size="20"
						class="productTextField" /></td>
				</tr>
				<tr>
					<td>Task Name</td>
					<td><input type="text" name="Name" size="20"
						class="productTextField" /></td>
				</tr>
				<tr>
					<td>Description</td>
					<td><input type="text" name="Description" size="20"
						class="productTextField" /></td>
				</tr>
				<tr>
					<td>Start Date</td>
					<td><input type="date" name="date" size="20"
						class="productTextField" /></td>
				</tr>
				<tr>
					<td>End Date</td>
					<td><input type="date" name="date" size="20"
						class="productTextField" /></td>
				</tr>
			</table>
			<button class="actionBtn" style="margin-top:10px">Add</button>
		</form>
	</div>
</body>
</html>