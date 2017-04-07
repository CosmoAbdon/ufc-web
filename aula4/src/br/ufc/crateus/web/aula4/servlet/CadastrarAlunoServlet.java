package br.ufc.crateus.web.aula4.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ufc.crateus.web.aula4.entidade.Contato;
import br.ufc.crateus.web.aula4.persistence.ContatosManager;

@WebServlet("/cadastrarAluno")
public class CadastrarAlunoServlet extends HttpServlet {

	private static final long serialVersionUID = -2204628763069051999L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter().println("<h1>Aluno Cadastrado - GET</h1>");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("CadastrarAlunoServlet.doPost");
		String nome = req.getParameter("name");
		Contato c = new Contato(nome, "", "");
		ContatosManager.addContato(c);
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/contatoAdicionado.html");
		rd.forward(req, resp);
	}
}
