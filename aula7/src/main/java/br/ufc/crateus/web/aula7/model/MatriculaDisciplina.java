package br.ufc.crateus.web.aula7.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class MatriculaDisciplina {

	@Id
    @GeneratedValue
    private long id;
    @OneToOne
    private Aluno aluno;
    @OneToOne
    private Disciplina disciplina;
    private int ano;
    
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public Disciplina getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	@Override
	public String toString() {
		return "MatriculaDisciplina [id=" + id + ", aluno=" + aluno + ", disciplina=" + disciplina + ", ano=" + ano
				+ "]";
	}
}
