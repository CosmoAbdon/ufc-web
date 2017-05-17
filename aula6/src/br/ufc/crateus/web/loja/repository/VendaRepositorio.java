package br.ufc.crateus.web.loja.repository;

import br.ufc.crateus.web.loja.model.Venda;

public class VendaRepositorio extends AbstractRepositorio<Venda>{
	
	private static VendaRepositorio repositorio;
	
	public static synchronized VendaRepositorio getInstance(){
		if (repositorio == null)
			repositorio = new VendaRepositorio();
		return repositorio;
	}
	
	private VendaRepositorio(){
	}
}
