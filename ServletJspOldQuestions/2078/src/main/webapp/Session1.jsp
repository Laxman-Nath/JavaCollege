<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Setting session</title>
</head>
<body>
	<%

	session.setAttribute("name", "laxman nath");
	session.setAttribute("age", 23);
	request.getRequestDispatcher("Session2.jsp").forward(request, response);
	%>
</body>
</html>