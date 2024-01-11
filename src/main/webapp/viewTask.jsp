<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="dao.taskManagementDao"%>
<%@page import="com.Task"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>view Task</title>
 <style>
        .Table{
            width: 75%;
            background-color: gray;
            margin:auto;
        }
    </style>
</head>
<body>
	<%@ include file="navBar.jsp" %>  

	<table align="center" class="Table">
		<thead>
			<tr>
				<th>TASK ID</th>
				<th>TASK Name</th>
				<th>Description</th>
				<th>SART DATE</th>
				<th>END DATE</th>
				<th colspan="2">Actions</th>
			</tr> 
		</thead>
		<%
			List<Task> taskList = taskManagementDao.getAllProducts() ;
			for (Task t : taskList) {
		%>
		<tr>
			<td><%=t.getTaskId()%></td>
			<td><%=t.getTaskName() %></td>
			<td><%=t.getTaskDescription()%></td>
			<td><%=t.getStart() %></td>
			<td><%=t.getEnd() %></td>
			<td><button class="actionBtn" onclick="location.href = 'editTask.jsp?taskId=<%= t.getTaskId()%>';">Edit</button></td>
			<td><button class="actionBtn" onclick="location.href = 'deleteTask.jsp?taskId=<%= t.getTaskId()%>';">Delete</button></td>
		</tr>

		<%
}
%>
	</table>
	
</body>
</html>