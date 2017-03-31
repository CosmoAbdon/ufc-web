package entidades;

import java.util.Arrays;
import java.util.List;

public abstract class Solo extends Atleta{
	
	private String nomeEquipe;
	private Atleta atlx;
	
	public Solo(String string, Atleta atletas ) {
		setNomeEquipe(string);
		//setAtleta(atlx);
		atlx = atletas;
	}

	public String getNomeEquipe() {
		return nomeEquipe;
	}

	public void setNomeEquipe(String nomeEquipe) {
		this.nomeEquipe = nomeEquipe;
	}
	
	public Atleta getAtletas()
	{
		return atlx;
	}
	
	public void setAtleta(Atleta atlx)
	{
		this.atlx = atlx;
	}

	public String getNomeAtleta()
	{
		return atlx.getNomeExibicao();
	}
	
	public String getNomeTimeJogador()
	{
		return "Equipe : "+nomeEquipe+" - Nome : "+toStringNome();
	}
	
}
