<%@page import="com.bean.UserBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ecom List User</title>
</head>
<body>

<% 
	ArrayList<UserBean> users = (ArrayList<UserBean>)request.getAttribute("users");
%>

Welcome ...
${cookie.firstName.value}
<br>

<table border="1">
	<tr>
		<th>FirstName</th>
		<th>Email</th>
		<th>Password</th>
		<th>Action</th>
	</tr>

	<%for(UserBean user:users ){ %>
		<tr>
			<td><%=user.getFirstName() %> </td>
			<td><%=user.getEmail() %></td>
			<td><%=user.getPassword()  %></td>
			<td><a href="DeleteUserServlet?email=<%=user.getEmail()%>">Delete</a>
				<a href="ViewUserServlet?email=<%=user.getEmail()%>">View</a>
			</td>
		</tr>
	<%} %>


</table>

</body>
</html>