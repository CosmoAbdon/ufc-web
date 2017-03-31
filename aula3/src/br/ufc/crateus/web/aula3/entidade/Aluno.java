package br.ufc.crateus.web.aula3.entidade;

public class Aluno {
	
	private String nome;

	public Aluno(String string) {
		setNome(string);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome =
				nome;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + "]";
	}

}
