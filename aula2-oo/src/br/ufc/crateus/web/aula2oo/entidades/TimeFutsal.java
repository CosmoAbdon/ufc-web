package br.ufc.crateus.web.aula2oo.entidades;

import br.ufc.crateus.web.aula2oo.exceptions.TimeInvalidoException;

public class TimeFutsal extends Time{

	private static final int _5 = 5;

	public TimeFutsal(String nome, Jogador... jogadores) throws TimeInvalidoException {
		super(nome, jogadores);
	}

	@Override
	protected int getTamanhoEsperado() {
		return _5;
	}

}
