<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>hello Maven SSM!</h3>
	<form action="login.do" method="post">
		用户名:<input type = "text" name = "name" holderplace="请输入用户名"><br>
		密码:<input type = "password" name = "password" holderplace="请输入密码"><br>
		<input type = "submit" value="提交">${msg}
	</form>
</body>
</html>