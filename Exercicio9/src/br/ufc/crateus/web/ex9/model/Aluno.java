package br.ufc.crateus.web.ex9.model;

import java.util.Date;

public class Aluno {
	
	private int id;
	private String nome;
	private String matricula;
	private Date dataNascimento;
	
	public Aluno() {
		super();
	}

	public Aluno(int id, String nome, String matricula, Date dataNascimento) {
		super();
		this.id = id;
		this.nome = nome;
		this.matricula = matricula;
		this.dataNascimento = dataNascimento;
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

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
}
