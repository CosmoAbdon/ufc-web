package br.ufc.crateus.web.aula2oo.entidades;

public abstract class Competidor implements ICompetidor{

	private String nome;

	public Competidor() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}