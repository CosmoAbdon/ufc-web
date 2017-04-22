package br.ufc.crateus.web.aula05.model;

public class Contato {

	@Override
	public String toString() {
		return "Contato [id=" + id + ", nome=" + nome + ", email=" + email + ", telefone=" + telefone + "]";
	}

	private int id;
	private String nome;
	private String email;
	private String telefone;

	public Contato() {
	}

	public Contato(String nome, String email, String telefone) {
		setEmail(email);
		setNome(nome);
		setTelefone(telefone);
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
