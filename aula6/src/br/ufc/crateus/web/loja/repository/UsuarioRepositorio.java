package br.ufc.crateus.web.loja.repository;

import br.ufc.crateus.web.loja.model.Usuario;

public class UsuarioRepositorio extends AbstractRepositorio<Usuario>{
	
	private static UsuarioRepositorio repositorio;
	
	public static synchronized UsuarioRepositorio getInstance(){
		if (repositorio == null)
			repositorio = new UsuarioRepositorio();
		return repositorio;
	}
	
	private UsuarioRepositorio(){
		add(new Usuario("jose", "jose123"));
		add(new Usuario("joao", "joao123"));
	}

	public Usuario getbyLogin(String login) {
		for(Usuario u: repository.values())
			if (u.getLogin().equals(login))
				return u;
		return null;
	}
}
