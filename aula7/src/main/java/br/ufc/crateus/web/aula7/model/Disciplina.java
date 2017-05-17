package br.ufc.crateus.web.aula7.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Disciplina {

	@Id
	@GeneratedValue
	private int id;
	private String nome;
	private int cargahoraria;

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

	public int getCargahoraria() {
		return cargahoraria;
	}

	public void setCargahoraria(int cargahoraria) {
		this.cargahoraria = cargahoraria;
	}

	@Override
	public String toString() {
		return "Disciplina [id=" + id + ", nome=" + nome + ", cargahoraria=" + cargahoraria + "]";
	}

}
