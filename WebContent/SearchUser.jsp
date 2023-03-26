<%@page import="com.bean.UserBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="SearchUserServlet" method="post">
		Name <input type="text" name="firstName" /> <br>
		<bR> <input type="submit" value="Search" />
	</form>
	
	
	<% 
	ArrayList <UserBean> users = (ArrayList<UserBean>)request.getAttribute("users");
	%>
	
	<%if(users !=null){ %>
	<table border="1">
	<tr>
		<th>FirstName</th>
		<th>Email</th>
		<th>Password</th>
		<th>Action</th>
	</tr>

	<%for(UserBean  user:users ){ %>
		<tr>
			<td><%=user.getFirstName() %> </td>
			<td><%=user.getEmail() %></td>
			<td><%=user.getPassword()  %></td>
			 
		</tr>
	<%} %>
<%} %>

</table>
	
</body>
</html>