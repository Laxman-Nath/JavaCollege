<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Getting session data</title>
</head>
<body>
<%
out.println("<h1>Name:"+session.getAttribute("name")+"</h1>");
out.println("<h1>Age:"+session.getAttribute("age")+"</h1>");
%>
</body>
</html>