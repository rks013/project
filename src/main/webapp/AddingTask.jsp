<%@page import="dao.taskManagementDao"%>
<%@page import="com.Task"%>
<%@page import="java.util.Date"%>
<%

String taskId = request.getParameter("Id");
String taskName = request.getParameter("Name");
String taskdescription = request.getParameter("description");
String startDate = (Date)request.getParameter("startDate");
Date endDate =Date.parse( request.getParameter("endDate"));

Product product = new Product(,productName,productCategory,productPrice);

int status = ProductManagementDAO.addProduct(product);
if(status == 1)
{
	response.sendRedirect("viewProducts.jsp"); 
}
else
{
	response.sendRedirect("error.jsp"); 
}

%>