<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login form</title>
</head>
<body>
	<form action="login" method="post">
		<div style="margin: 5px">
			UserName:<input type="text" name="username" />
		</div>
		<div style="margin: 5px">
			Password:<input type="password" name="password" />
		</div>
		<div style="margin: 5px">
			<input type="submit" value="Submit" />
		</div>
	</form>
</body>
</html>