package br.ufc.crateus.web.oo1;

import java.util.Arrays;

import br.ufc.crateus.web.oo1.entidades.Jogador;
import br.ufc.crateus.web.oo1.entidades.Partida;
import br.ufc.crateus.web.oo1.entidades.Ranking;

public class App {
	
	public static void main(String[] args) {
//		Carta c = new Carta();
		
		Jogador j1 = new Jogador();
		j1.setNome("Jose");
		Jogador j2 = new Jogador();
		j2.setNome("Maria");
		
		Partida p = new Partida();
		p.setJ1(j1);
		p.setPontosJ1(2);
		p.setJ2(j2);
		p.setPontosJ2(3);
		
		Partida p2 = new Partida();
		p2.setJ1(j1);
		p2.setPontosJ1(4);
		p2.setJ2(j2);
		p2.setPontosJ2(3);
		
		Partida p3 = new Partida();
		p3.setJ1(j1);
		p3.setPontosJ1(2);
		p3.setJ2(j2);
		p3.setPontosJ2(3);
		
		System.out.println(p.getVencedor());
		System.out.println(p2.getVencedor());
		System.out.println(p3.getVencedor());
		
		System.out.println(Ranking.getVencedor(Arrays.asList(p,p2,p3)));
	}

}

