package br.ufc.crateus.web.aula05.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ufc.crateus.web.aula05.model.Passagem;

@WebServlet("/ListarPassagens")
public class ListarPassagens extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Passagem> passagens = new ArrayList<>();
		passagens.add(new Passagem("Andre"));
		passagens.add(new Passagem("Jose"));
		passagens.add(new Passagem("Joao"));
		passagens.add(new Passagem("Pedro"));
		
		request.setAttribute("passagens", passagens);
		
		getServletContext().getRequestDispatcher("/listarPassagens.jsp").forward(request, response);
	}

}
