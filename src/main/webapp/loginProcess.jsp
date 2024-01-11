
<%@page import ='dao.loginDao' %>
<%@page import ='com.loginInfo' %>
<% 
	String userName = request.getParameter("userName");
	String password = request.getParameter("password");
	

	if(loginDao.isUserValid(new loginInfo(userName,password)))
	{
		session.setAttribute("userName",userName);//name value pair
		session.setMaxInactiveInterval(200); 
		response.sendRedirect("home.jsp"); //send user home.jsp after successful login.
	}
	else 
	{
		response.sendRedirect("loginFailed.jsp"); //else user will be taken to loginFailed.jsp page
	}
%>