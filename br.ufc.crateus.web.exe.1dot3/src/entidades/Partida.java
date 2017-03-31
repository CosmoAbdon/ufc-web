package entidades;

public class Partida {

	
	public String nomeVencedorEIndiv(String nome, int pontos)
	{
		return "Vencedor : "+nome+" Pontuação : "+pontos;
	}
	
	public String nomePerdedorEIndiv(String nome, int pontos)
	{
		return "Perdedor : "+nome+" Pontuação : "+pontos;
	}
	
	public String resultadoPartidaEquipeIndividual(String ganha, String perde, int pganha, int pperde){
		
		return "Vencedor : "+ganha+" - Pontuação : "+pganha+"\nPerdedor : "+perde+" - Pontuação : "+pperde;
	}
	
	public String resultadoPartidaIndvIndividual(String ganha, String perde, int pganha, int pperde){
		
		return "Vencedor : "+ganha+" - Pontuação : "+pganha+"\nPerdedor : "+perde+" - Pontuação : "+pperde;
	}
}
