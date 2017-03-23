package br.ufc.crateus.web.aula2oo.exceptions;

public class TimeInvalidoException extends Exception {

	private static final long serialVersionUID = 9129247206435609344L;

	public TimeInvalidoException(int atual, int esperado) {
		super("O time deveria ter " + esperado + " jogadores mas possui " + atual);
	}
}
