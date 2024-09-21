<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Decleration tag</h1>
	<%!String name = "laxman";
	int a = 12;
    
	String showName(String name) {
		return name;
	}
	int add(int a,int b){
		return a+b;
	}
	%>
	<h1>
		Expression tag Name is :<%=showName(name)%></h1>
		<h1><%= add(2,3)%></h1>
		
	<%
	out.println("<h1>Inside scriplet tag</h1>");
	  out.println("<h1>'"+showName(name)+"'</h1>");
	
	 out.println("<h1>'"+name+"'</h1>");
	%>
</body>
</html>