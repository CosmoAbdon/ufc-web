package br.ufc.crateus.web.loja.repository;

import br.ufc.crateus.web.loja.model.Cliente;

public class ClienteRepositorio extends AbstractRepositorio<Cliente>{
	
	private static ClienteRepositorio repositorio;
	
	public static synchronized ClienteRepositorio getInstance(){
		if (repositorio == null)
			repositorio = new ClienteRepositorio();
		return repositorio;
	}
	
	private ClienteRepositorio(){
		add(new Cliente("Ana Albuquerque Lima", "analima@gmail.com", "088999723645"));
		add(new Cliente("Paulo Cesar Monteiro", "paulocm@gmail.com", "085996420011"));
	}
}
