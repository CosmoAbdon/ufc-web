package br.ufc.crateus.web.ex9.model;

public class Disciplina {

	private int id;
	private String nome;
	private int creditos;
	
	public Disciplina() {
		super();
	}
 
	public Disciplina(int id, String nome, int creditos) {
		super();
		this.id = id;
		this.nome = nome;
		this.creditos = creditos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCreditos() {
		return creditos;
	}

	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}
	
	
	
}
