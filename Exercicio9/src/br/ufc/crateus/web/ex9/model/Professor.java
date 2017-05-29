package br.ufc.crateus.web.ex9.model;

import java.util.Date;

public class Professor {
	
	private int id;
	private String nome;
	private Date dataNascimento;
	private String graducao;
	
	public Professor(int id, String nome, Date dataNascimento, String graducao) {
		super();
		this.id = id;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.graducao = graducao;
	}

	public Professor() {
		super();
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

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getGraducao() {
		return graducao;
	}

	public void setGraducao(String graducao) {
		this.graducao = graducao;
	}
	
	
	
}
