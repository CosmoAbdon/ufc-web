package br.ufc.crateus.web.oo1.entidades;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Ranking {
	
	public static Jogador getVencedor(List<Partida> partidas){
		Map<Jogador, Integer> ranking = new HashMap<Jogador, Integer>();
		
		for (Partida partida : partidas) {
			Jogador vencedor = partida.getVencedor();
			if(ranking.containsKey(vencedor)){
				ranking.put(vencedor, ranking.get(vencedor)+1);
			} else {
				ranking.put(vencedor, 1);
			};
		}
		
		Entry<Jogador, Integer> vencedor = null;
		
		for (Entry<Jogador, Integer> jogador : ranking.entrySet()) {
			if(vencedor == null){
				vencedor = jogador;
				continue;
			}
			if(vencedor.getValue() < jogador.getValue())
				vencedor = jogador;
		}
		
		return vencedor.getKey();
	}
	
}
