<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Settings cookies</title>
</head>
<body>
	<%
	Cookie cookie=new Cookie("name","laxman");
	response.addCookie(cookie);
	request.getRequestDispatcher("cookie2.jsp").forward(request, response);
	%>
</body>
</html>