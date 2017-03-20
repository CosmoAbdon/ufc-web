package br.ufc.crateus.web.oo1.entidades;

public class Jogador {

	private String nome;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Jogador getGanhador(Jogador outro, int pontosOutro, int meusPontos){
		return pontosOutro > meusPontos ? outro : this;
	}

	@Override
	public String toString() {
		return "Jogador [nome=" + nome + "]";
	}
	
	
}
