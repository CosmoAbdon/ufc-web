package br.ufc.crateus.web.ex9.repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import br.ufc.crateus.web.ex9.model.Aluno;
import br.ufc.crateus.web.ex9.model.Disciplina;

public class DisciplinaRepository {

	private static List<Disciplina> disciplinas = new ArrayList<>();
	private static int id = 1;

	public static List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public static Disciplina getById(int id) {
		for (Iterator<Disciplina> it = disciplinas.iterator(); it.hasNext();) {
			Disciplina disciplina = it.next();
			if (disciplina.getId() == id) {
				return disciplina;
			}
		}
		System.out.println("Id not found: " + id);
		return null;
	}

	public static void save(Disciplina disciplina) {
		disciplina.setId(id++);
		disciplinas.add(disciplina);
		System.out.println("Saved: " + disciplina);
	}

	public static void update(Disciplina newAluno) {
		for (Iterator<Disciplina> it = disciplinas.iterator(); it.hasNext();) {
			Disciplina disciplina = it.next();
			if (disciplina.getId() == newAluno.getId()) {
				disciplina.setNome(newAluno.getNome());
				disciplina.setCreditos(newAluno.getCreditos());
				System.out.println("Updated: " + disciplina);
				return;
			}
		}
	}

	public static void delete(Disciplina deleted) {
		for (Iterator<Disciplina> it = disciplinas.iterator(); it.hasNext();) {
			Disciplina disciplina = it.next();
			if (disciplina.getId() == deleted.getId()) {
				it.remove();
				return;
			}
		}
		System.out.println("Delete - Id not found: " + deleted.getId());
	}
}