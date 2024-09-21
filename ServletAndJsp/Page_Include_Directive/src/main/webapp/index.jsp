<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.Date"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Page and include directive in jsp</title>
</head>
<body>
	<%
	List<String> names = new ArrayList<>();
	names.add("Laxman");
	names.add("Rohit");
	names.add("bikash");
	request.setAttribute("names", names);
	%>
	<%@ include file="header.jsp"%>

	<h1>
		Todays date is:<%=new Date()%></h1>

	<c:forEach var="n" items="${names}">
		<h1><c:out value="${n}"></c:out></h1>
	</c:forEach>
	
	<c:set var="a" value="10"></c:set>
	<h1>The value of a is:<c:out value="${a}"></c:out></h1>
</body>
</html>