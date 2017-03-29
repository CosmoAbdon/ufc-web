package entidades;

import java.util.Arrays;
import java.util.List;

public class Equipe extends Atleta{
	
	private String nomeEquipe;
	private List<Atleta> atlx;
	
	public Equipe(String string, Atleta ... atletas ) {
		setNomeEquipe(string);
		setAtleta(Arrays.asList(atletas));
	}

	public String getNomeEquipe() {
		return nomeEquipe;
	}

	public void setNomeEquipe(String nomeEquipe) {
		this.nomeEquipe = nomeEquipe;
	}
	
	public List<Atleta> getAtletas()
	{
		return atlx;
	}
	
	public void setAtleta(List<Atleta> atls)
	{
		atlx = atls;
	}

	public String getNomeFromList(List <Atleta> atls)
	{
		for (Atleta atleta : atlx) {
			return atlx.get(0).getNome();
		}
		return "a";
	}
	
	public String getNomeTimeJogador()
	{
		return "Equipe : "+nomeEquipe+" - Nome : "+getNomeFromList(atlx);
	}
	
}
