package br.ufc.crateus.web.oo1.entidades;

public enum Naipe {

	copa("Copa", 1), ouro("Ouro", 1), paus("Paus", 2), espadas("Espadas", 2);

	private Naipe(String nome, int cor) {
		setNome(nome);
		setCor(cor);
	}

	private String nome;
	private int cor;
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCor() {
		return cor;
	}

	public void setCor(int valor) {
		this.cor = valor;
	}
}
