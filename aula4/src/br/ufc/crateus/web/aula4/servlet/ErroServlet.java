package br.ufc.crateus.web.aula4.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.servlets.WebdavServlet;

@WebServlet("/erro")
public class ErroServlet extends WebdavServlet{

	private static final long serialVersionUID = 2778971747411694419L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		throw new CadastroException();
	}
	
}
