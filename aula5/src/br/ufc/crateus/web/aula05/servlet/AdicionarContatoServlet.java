package br.ufc.crateus.web.aula05.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ufc.crateus.web.aula05.model.Contato;
import br.ufc.crateus.web.aula05.repository.ContatoRepository;

@WebServlet("/AdicionarContato")
public class AdicionarContatoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		String telefone = request.getParameter("telefone");
		ContatoRepository.addContato(new Contato(nome, email, telefone));
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/listarContatos.jsp");
		rd.forward(request, response);
	}

}
