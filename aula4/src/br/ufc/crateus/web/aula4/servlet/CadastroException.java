package br.ufc.crateus.web.aula4.servlet;

import javax.servlet.ServletException;

public class CadastroException extends ServletException {

	private static final long serialVersionUID = -5290010625161931260L;

	public CadastroException() {
		super("Erro ao cadastrar");
	}
}
