package br.ufc.crateus.web.aula2oo.entidades;

import br.ufc.crateus.web.aula2oo.exceptions.TimeInvalidoException;

public class TimeVoley extends Time{

	private static final int _6 = 6;

	public TimeVoley(String nome, Jogador... jogadores) throws TimeInvalidoException {
		super(nome, jogadores);
	}

	@Override
	protected int getTamanhoEsperado() {
		return _6;
	}

}
