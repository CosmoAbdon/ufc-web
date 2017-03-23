package br.ufc.crateus.web.aula2oo.entidades;

public class Jogador extends Competidor {

	public Jogador(String nome) {
		setNome(nome);
	}

	@Override
	public String getNomeExibicao() {
		return getNome();
	}

}
