package br.ufc.crateus.web.aula05.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.ufc.crateus.web.aula05.model.Contato;

public class ContatoRepository {

	private static Map<Integer, Contato> contatos = new HashMap<>();
	private static int id = 1;
	
	static{
		addContato(new Contato("jose", "jose@gmail.com", "088999887766"));
	}
	
	public static void addContato(Contato contato){
		contato.setId(id++);
		contatos.put(contato.getId(), contato);
	}
	
	public static Collection<Contato> getContatos(){
		return contatos.values();
	}
	
}
