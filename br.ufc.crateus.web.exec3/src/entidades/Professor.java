package entidades;

public class Professor {
	
	private String nome;
	private String disciplina;
	
	
	public Professor(String nome, String discp) {
		setNome(nome);
		setDisciplina(discp);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	

}
