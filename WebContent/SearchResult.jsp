<%@page import="java.util.ArrayList"%>
<%@page import="com.bean.UserBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
	ArrayList<UserBean> users = (ArrayList<UserBean>)request.getAttribute("users");
%>




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


</table>

</body>
</html>