<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>About page</title>
</head>
<body>
	<h1>This is about page</h1>
	<%
	Cookie[] cookies = request.getCookies();
	out.println("<h1>The cookies are:"+"</h1>");
	for(int i=0;i<cookies.length;i++){
		out.println("<h1>"+(i+1)+")."+cookies[i].getName()+":"+cookies[i].getValue()+"</h1><br/>");
	}
	
	%>
	<h1>Session is :<%=session.getAttribute("age") %></h1>
</body>
</html>