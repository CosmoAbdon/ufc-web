package br.ufc.crateus.web.escola.view.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class EscolaBean {

	private String nome = "Primeiro de Janeiro";

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
