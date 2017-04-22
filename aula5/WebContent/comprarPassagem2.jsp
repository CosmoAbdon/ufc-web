<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>CLA</title>
</head>
<body>
<form action="comprarPassagem3.jsp" method="post">
	<h3>Dados Pessoais</h3>
	<%= request.getParameter("nome") %> <br/>
	Nome: <input type="text" name="nome" value="${param.nome}" readonly><br/>
	Email: <input type="text" name="email" value="${param.email}" readonly><br/>
	Telefone: <input type="text" name="telefone" value="${param.telefone}" readonly><br/>
	RG: <input type="text" name="rg" value="${param.rg}" readonly><br/>	
	
	<h3>Informacoes do Voo</h3>
	Data: <input type="text" name="data"><br/>
	Hora: <input type="text" name="hora"><br/>
	Origem: 
	<select name="origem">
		<option value="cra">Crateus</option>
		<option value="for">Fortaleza</option>
		<option value="jua">Juazeiro</option>
		<option value="sob">Sobral</option>
	</select><br/>
	Destino: <select name="destino">
		<option value="cra">Crateus</option>
		<option value="for">Fortaleza</option>
		<option value="jua">Juazeiro</option>
		<option value="sob">Sobral</option>
	</select><br/>
	<input type="submit" value="Pr&oacute;ximo">
</form>

</body>
</html>