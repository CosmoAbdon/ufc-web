package entidades;

public class Partida {

	
	public String nomeVencedorEIndiv(String nome, int pontos)
	{
		return "Vencedor : "+nome+" Pontua��o : "+pontos;
	}
	
	public String nomePerdedorEIndiv(String nome, int pontos)
	{
		return "Perdedor : "+nome+" Pontua��o : "+pontos;
	}
	
	public String resultadoPartidaEquipeIndividual(String ganha, String perde, int pganha, int pperde){
		
		return "Vencedor : "+ganha+" - Pontua��o : "+pganha+"\nPerdedor : "+perde+" - Pontua��o : "+pperde;
	}
	
	public String resultadoPartidaIndvIndividual(String ganha, String perde, int pganha, int pperde){
		
		return "Vencedor : "+ganha+" - Pontua��o : "+pganha+"\nPerdedor : "+perde+" - Pontua��o : "+pperde;
	}
}
