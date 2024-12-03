<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login form</title>
</head>
<body>
	<h1
		style="text-align: center; color: green; font-weight: bold; font-size: 40px;">Write
		a simple jsp file to display tribhuwan university five times.(2078,5
		marks question)</h1>

	<%
	for (int i = 0; i < 5; i++) {
		out.println("<p style='color:red;font-size:20px;text-align:center;'>Tribhuwan university</p>");

	}
	%>
</body>
</html>