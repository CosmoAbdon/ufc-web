<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>CLA</title>
</head>
<body>
<form action="FinalizarCompra" method="post">
	<h3>Dados Pessoais</h3>
	Nome: <input type="text" name="nome" value="${param.nome}" readonly><br/>
	Email: <input type="text" name="email" value="${param.email}" readonly><br/>
	Telefone: <input type="text" name="telefone" value="${param.telefone}" readonly><br/>
	RG: <input type="text" name="rg" value="${param.rg}" readonly><br/>	
	<h3>Informacoes do Voo</h3>
	Data: <input type="text" name="data" value="${param.data}" readonly><br/>
	Hora: <input type="text" name="hora" value="${param.hora}" readonly><br/>
	Origem: 
	<select name="origem" >
		<option value="cra" <c:if test="${param.origem eq 'cra'}">selected</c:if>>Crateus</option>
		<option value="for" <c:if test="${param.origem eq 'for'}">selected</c:if>>Fortaleza</option>
		<option value="jua" <c:if test="${param.origem eq 'jua'}">selected</c:if>>Juazeiro</option>
		<option value="sob" <c:if test="${param.origem eq 'sob'}">selected</c:if>>Sobral</option>
	</select><br/>
	Destino: 
	<select name="destino" >
		<option value="cra" <c:if test="${param.destino eq 'cra'}">selected</c:if>>Crateus</option>
		<option value="for" <c:if test="${param.destino eq 'for'}">selected</c:if>>Fortaleza</option>
		<option value="jua" <c:if test="${param.destino eq 'jua'}">selected</c:if>>Juazeiro</option>
		<option value="sob" <c:if test="${param.destino eq 'sob'}">selected</c:if>>Sobral</option>
	</select><br/>
	<h3>Informacoes de Pagamento</h3>
	Bandeira: 
	<select name="bandeiraCartao">
		<option value="visa">VISA</option>
		<option value="master">MASTER</option>
		<option value="elo">ELO</option>
	</select><br/>
	Numero do cartao: <input type="text" name="numeroCartao"><br/>
	Validade do cartao: <input type="text" name="validadeCartao"><br/>
	<input type="submit" value="Pr&oacute;ximo">
</form>

</body>
</html>