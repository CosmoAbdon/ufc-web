<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="br.ufc.crateus.web.aula05.repository.ContatoRepository"%>
<%@ page import="br.ufc.crateus.web.aula05.model.Contato"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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

	<h2>Contatos</h2>
	${param.teste}
		
	<table border="1px">
		<thead>
			<tr>
				<td>Id</td>
				<td>Nome</td>
				<td>Email</td>
				<td>Telefone</td>
			</tr>
		</thead>
		<% for (Contato c: ContatoRepository.getContatos()){ %>
		<tr>
			<td><%=c.getId() %></td>
			<td><%=c.getNome() %></td>
			<td><%=c.getEmail() %></td>
			<td><%=c.getTelefone() %></td>
		</tr>
		<%}; %>
	</table>

</body>
</html>