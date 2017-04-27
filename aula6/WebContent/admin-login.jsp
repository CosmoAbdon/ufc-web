<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Loja</title>
</head>
<body>
<h1>Loja</h1>
<h2>Admin Login</h2>

<c:url value="/adminLogin" var="adminLogin"></c:url>
<form action="${adminLogin}" method="post" style="margin: 50px" >
	<label style="color: red">${errorMessage}</label><br>
	<label>Login</label>
	<input type="text" name="login" required></input><br/>
	<label>Senha</label>
	<input type="password" name="senha" required></input><br/>
	<input type="submit" value="Entrar"></input>
</form>

</body>
</html>