package br.ufc.crateus.web.aula4.persistence;

import java.util.HashMap;
import java.util.Map;

import br.ufc.crateus.web.aula4.entidade.Contato;


public class ContatosManager {
	
	private static Map<Integer, Contato> contatos = new HashMap<>();
	private static int idCount = 0;
		
	public static void addContato(Contato contato){
		int id = ++idCount;
		contato.setId(id);
		contatos.put(id, contato);
	}
	public static Map<Integer, Contato> getContatos() {
		return contatos;
	}

	public static void setContatos(Map<Integer, Contato> contatos) {
		ContatosManager.contatos = contatos;
	}
	

}
