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
		String firstNameError = (String) request.getAttribute("firstNameError");
		String emailError = (String) request.getAttribute("emailError");
	%>

	<h2>Signup</h2>

	<form action="RegistrationServlet" method="post">

		FirstName : <input type="Text" name="firstName" />
		<%=firstNameError == null ? "" : firstNameError%>
		<br> <br> Email : <input type="text" name="email" /><%=emailError == null ? "" : emailError%><br>
		<Br> Password : <input type="password" name="password"><br>
		<br>

		<button type="submit">Signup</button>

	</form>

</body>
</html>