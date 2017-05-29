package br.ufc.crateus.web.ex9.view.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;

import br.ufc.crateus.web.ex9.model.Disciplina;
import br.ufc.crateus.web.ex9.repository.DisciplinaRepository;

@ManagedBean
public class DisciplinaBean {

	private Disciplina disciplina;
	
	public DisciplinaBean() {
		disciplina = new Disciplina();
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina professor) {
		this.disciplina = professor;
	}
	
	public List<Disciplina> getDisciplinas(){
		return DisciplinaRepository.getDisciplinas();
	}
	
	public String remover(Disciplina professor){
		DisciplinaRepository.delete(professor);
		setDisciplina(new Disciplina());
		return "/disciplina";
	}
	
	public String carregar(Disciplina professor){
		System.out.println("Carregar - " + professor);
		setDisciplina(professor);
		return "/disciplina";
	}
	
	public String salvar(){
		if(DisciplinaRepository.getById(getDisciplina().getId()) == null){
			DisciplinaRepository.save(getDisciplina());
			setDisciplina(new Disciplina());
			return "/disciplina";
		} 
		DisciplinaRepository.update(getDisciplina());
		setDisciplina(new Disciplina());
		return "/disciplina";
	}
}