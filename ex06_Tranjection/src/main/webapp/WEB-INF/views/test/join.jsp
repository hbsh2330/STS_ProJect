<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
	<h1>test/join Page</h1>
	
	<form action="${pageContext.request.contextPath}/test/join" method="Post">
		<input name="name" /></br>
		<input name="age" /></br>
		<input name="addr" /></br>
		 <button>Join</button>
	</form>	
</body>
</html>