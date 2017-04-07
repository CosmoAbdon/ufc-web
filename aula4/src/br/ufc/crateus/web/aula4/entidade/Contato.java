package br.ufc.crateus.web.aula4.entidade;

import java.util.Date;

public class Contato {

	private int id;
	private String nome;
	private String email;
	private String endereco;
	private Date dataNasc;

	public Contato(String nome, String email, String endereco) {
		setNome(nome);
		setEmail(email);
		setEndereco(endereco);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
