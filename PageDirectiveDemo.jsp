<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" session="false" info="this is demo"
	import="java.util.Date,java.io.File" import="java.util.concurrent.*"%>

<%@page buffer="8kb" autoFlush="true" errorPage="MyError.jsp"
	isThreadSafe="false" isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	Date d = new Date();
	int a = 90;
	int b = 0;
	int c = a / b;
	%>

	<%=d%>

</body>
</html>