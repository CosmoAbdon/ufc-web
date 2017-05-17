package br.ufc.crateus.web.loja.repository;

import br.ufc.crateus.web.loja.model.Produto;

public class ProdutoRepositorio extends AbstractRepositorio<Produto>{
	
	private static ProdutoRepositorio repositorio;
	
	public static synchronized ProdutoRepositorio getInstance(){
		if (repositorio == null)
			repositorio = new ProdutoRepositorio();
		return repositorio;
	}
	
	private ProdutoRepositorio(){
		add(new Produto("Notebook", 1800));
		add(new Produto("Caneta", 3));
	}
}
