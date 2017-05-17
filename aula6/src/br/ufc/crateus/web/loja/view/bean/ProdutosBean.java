package br.ufc.crateus.web.loja.view.bean;

import java.util.Collection;

import br.ufc.crateus.web.loja.model.Produto;
import br.ufc.crateus.web.loja.repository.ProdutoRepositorio;

public class ProdutosBean {
	
	public Collection<Produto> getProdutos() {
		return ProdutoRepositorio.getInstance().getAll();
	}
}
