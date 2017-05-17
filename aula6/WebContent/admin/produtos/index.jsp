<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/admin/cabecalho.jsp"></c:import>

<h2>Produtos</h2>

<jsp:useBean id="bean"
	class="br.ufc.crateus.web.loja.view.bean.ProdutosBean"></jsp:useBean>

<table border="1">
	<thead>
		<tr>
			<td>ID</td>
			<td>Nome</td>
			<td>Preco</td>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="p" items="${bean.produtos}">
			<tr>
				<td>${p.id}</td>
				<td>${p.nome}</td>
				<td>${p.preco}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
</body>
</html>