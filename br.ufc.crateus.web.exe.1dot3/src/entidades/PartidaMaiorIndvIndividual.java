package entidades;

public class PartidaMaiorIndvIndividual extends Partida{

	private int pontose1;
	private int pontose2;
	private Atleta atleta1;
	private Atleta atleta2;
	


	public int getPontose1() {
		return pontose1;
	}



	public void setPontose1(int pontose1) {
		this.pontose1 = pontose1;
	}



	public int getPontose2() {
		return pontose2;
	}



	public void setPontose2(int pontose2) {
		this.pontose2 = pontose2;
	}



	public Atleta getAtleta1() {
		return atleta1;
	}



	public void setAtleta1(Atleta atleta1) {
		this.atleta1 = atleta1;
	}



	public Atleta getAtleta2() {
		return atleta2;
	}



	public void setAtleta2(Atleta atleta2) {
		this.atleta2 = atleta2;
	}



	@SuppressWarnings("unused")
	public String getResultadoPartidaEquipeIndividual()
	{
		if(pontose1 > pontose2)
		{
			return resultadoPartidaEquipeIndividual(atleta1.getNomeExibicao(), atleta2.getNomeExibicao(), pontose1, pontose2);
		}else if(pontose2 > pontose1)
		{
			return resultadoPartidaEquipeIndividual(atleta2.getNomeExibicao(), atleta1.getNomeExibicao(), pontose2, pontose1);
		}
		
		return "a";
	}
	
}
