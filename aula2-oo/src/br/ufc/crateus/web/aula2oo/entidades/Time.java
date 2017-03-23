package br.ufc.crateus.web.aula2oo.entidades;

import java.util.Arrays;
import java.util.List;

import br.ufc.crateus.web.aula2oo.exceptions.TimeInvalidoException;

public abstract class Time extends Competidor{

	private List<Jogador> jogadores;
	
	public Time(String nome, Jogador... jogadores) throws TimeInvalidoException {
		setNome(nome);
		setJogadores(Arrays.asList(jogadores));
		if(!validar())
			throw new TimeInvalidoException(getJogadores().size(), getTamanhoEsperado()); 
	}

	protected abstract int getTamanhoEsperado();

	public List<Jogador> getJogadores() {
		return jogadores;
	}

	public void setJogadores(List<Jogador> jogadores) {
		this.jogadores = jogadores;
	}

	@Override
	public String getNomeExibicao() {
		return getNome() + "[ " + getJogadores() + " ]";
	}
	
	public boolean validar(){
		return getJogadores().size() == getTamanhoEsperado();
	};
	
}
