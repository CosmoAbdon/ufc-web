package br.ufc.crateus.web.loja.view.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ufc.crateus.web.loja.model.Usuario;
import br.ufc.crateus.web.loja.repository.UsuarioRepositorio;

@WebServlet("/adminLogin")
public class AdminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		Usuario usuario = UsuarioRepositorio.getInstance().getbyLogin(login);
		if (usuario != null && usuario.getSenha().equals(senha)){
			request.getSession().setAttribute("usuario", usuario);
			getServletContext().getRequestDispatcher("/admin").forward(request, response);
		}
		else {
			request.setAttribute("errorMessage", "Usuario ou senha invalidos");
			getServletContext().getRequestDispatcher("/admin-login.jsp").forward(request, response);
		}

	}
}
