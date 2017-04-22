package br.ufc.crateus.web.aula05.servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ufc.crateus.web.aula05.model.Passagem;

@WebServlet("/FinalizarCompra")
public class FinalizarCompra extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Passagem p = new Passagem();
		p.setBandeiraCartao(request.getParameter("bandeiraCartao"));
		p.setData(request.getParameter("data"));
		p.setDestino(request.getParameter("destino"));
		p.setEmail(request.getParameter("email"));
		p.setHora(request.getParameter("hora"));
		p.setNome(request.getParameter("nome"));
		p.setNumeroCartao(request.getParameter("numeroCartao"));
		p.setOrigem(request.getParameter("origem"));
		p.setRg(request.getParameter("rg"));
		p.setTelefone(request.getParameter("telefone"));
		p.setValidadeCartao(request.getParameter("validadeCartao"));
		
		request.setAttribute("passagem", p);

		getServletContext().getRequestDispatcher("/finalizarCompra.jsp").forward(request, response);
	}

}
