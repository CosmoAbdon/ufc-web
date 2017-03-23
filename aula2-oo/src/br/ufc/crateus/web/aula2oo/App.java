package br.ufc.crateus.web.aula2oo;

import java.util.ArrayList;
import java.util.List;

import br.ufc.crateus.web.aula2oo.entidades.ICompetidor;
import br.ufc.crateus.web.aula2oo.entidades.Jogador;
import br.ufc.crateus.web.aula2oo.entidades.TimeFutsal;
import br.ufc.crateus.web.aula2oo.entidades.TimeVoley;
import br.ufc.crateus.web.aula2oo.exceptions.TimeInvalidoException;

public class App {
	public static void main(String[] args) {

		List<ICompetidor> competidores = new ArrayList<>();
		
		TimeFutsal futsal;
		try {
			futsal = new TimeFutsal("Crateus FC", new Jogador("Jose2"), new Jogador("Jose3"), new Jogador("Jose4"), new Jogador("Danilo"));
			competidores.add(futsal);
		} catch (TimeInvalidoException e) {
			e.printStackTrace();
		}
		
		TimeVoley voley;
		try {
			voley = new TimeVoley("Crateus FC", new Jogador("CHico2"), new Jogador("CHico3"), new Jogador("CHico4"),new Jogador("CHico5"), new Jogador("Diogo"));
			competidores.add(voley);
		} catch (TimeInvalidoException e) {
			e.printStackTrace();
		}
		
//		System.out.println(futsal.validar() ? "Valido" : "Invalido");
//		System.out.println(voley.validar() ? "Valido" : "Invalido");
		
		competidores.add(new Jogador("Guga"));
		competidores.add(new ICompetidor() {
			
			@Override
			public String getNomeExibicao() {
				return "Eu sou uma classe que nao existe! meu deus";
			}
		});
		
		for (ICompetidor c : competidores) {
			System.out.println(c.getNomeExibicao());
		}
		
	}
}
