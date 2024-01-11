<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>navBar</title>
 <link rel="stylesheet" href="navbar.css">
</head>
<body>
	<%
	if(session.getAttribute("userName") == null)
	{
		response.sendRedirect("login.jsp"); 
	}
	%>
	<div id="navbar">
            <div class = "nav">
                <ul class="navbar-nav">
                    <li><a href="home.jsp">Home</a></li>
                    <li><a href="addTask.jsp">Add Task</a></li>
                    <li><a href="viewTasks.jsp">View Tasks</a></li>
                    <li><a href="removeTask.jsp">Delete Task</a></li>
                    <li><a href="updateTask.jsp">Update Task</a></li>
                </ul>   
        </div>
       
    </div>
</body>
</html>