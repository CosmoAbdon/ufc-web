package br.ufc.crateus.web.aula8.servlet;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ufc.crateus.web.aula8.model.Produto;

@WebServlet("/produto")
public class ProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ProdutoServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		EntityManager em = (EntityManager) request.getAttribute("em");
		List<Produto> resultList = em.createQuery("select p from Produto as p", Produto.class).getResultList();
		for (Produto p : resultList) {			
			response.getWriter().println(p);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		EntityManager em = (EntityManager) request.getAttribute("em");

		Produto p = new Produto();
		p.setNome(request.getParameter("nome"));
		p.setPreco(Float.parseFloat(request.getParameter("preco")));

		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();

		response.getWriter().println(p);
	}

}
