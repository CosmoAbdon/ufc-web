<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="br.ufc.crateus.web.aula05.repository.ContatoRepository"%>
<%@ page import="br.ufc.crateus.web.aula05.model.Contato"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Agenda</title>
</head>
<body>

	<%
		String titulo = "Agenda";
	%>

	<h1><%=titulo%>
	</h1>

	<h2>Novo Contato</h2>
	
	<form action="AdicionarContato" method="post">
		Nome:<input type="text" name="nome"/><br/>
		Email:<input type="text" name="email"/><br/>
		Telefone:<input type="text" name="telefone"/><br/>
		<input type="submit" value="Adicionar">
	</form>
</body>
</html>