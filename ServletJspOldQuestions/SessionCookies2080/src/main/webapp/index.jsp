<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home page</title>
</head>
<body>
	<h1>This is home page</h1>
	<%!int b = 20;%>
	<%
	Cookie cookie = new Cookie("name", "laxman");
	response.addCookie(cookie);
	
	session.setAttribute("age", 34);
	int a = 20;
	out.println("<h1>The value of a is:" + a + "</h1>");
	%>
	<h1>
		The value of b is<%=b%></h1>

	<a href="about.jsp">About</a>
</body>
</html>