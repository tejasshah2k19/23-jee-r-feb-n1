<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body>

	<%
		String nameError = (String) request.getAttribute("nameError");
		String emailError = (String) request.getAttribute("emailError");
	%>
	<form method="post" action="AddBookingServlet">
		Name : <input type="text" name="name">
		<%=nameError ==null ? "" : nameError %>
		<br> <Br> Email : <input type="text" name="email">
		<%=emailError!=null?emailError:"" %>
		<br> <br> <input type="submit" value="Add Booking" />
	</form>
</body>
</html>