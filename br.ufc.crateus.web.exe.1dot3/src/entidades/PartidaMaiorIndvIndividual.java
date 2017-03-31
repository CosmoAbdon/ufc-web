package entidades;

public class PartidaMaiorIndvIndividual extends Partida{

	private int pontose1;
	private int pontose2;
	private Solo competidor1;
	private Solo competidor2;


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




	public Solo getCompetidor1() {
		return competidor1;
	}




	public void setCompetidor1(Solo competidor1) {
		this.competidor1 = competidor1;
	}




	public Solo getCompetidor2() {
		return competidor2;
	}




	public void setCompetidor2(Solo competidor2) {
		this.competidor2 = competidor2;
	}




	@SuppressWarnings("unused")
	public String getResultadoPartidaIndvIndividual()
	{
		if(pontose1 > pontose2)
		{
			return resultadoPartidaEquipeIndividual(competidor1.getAtletas().getNome(), competidor2.getAtletas().getNome(), pontose1, pontose2);
		}else if(pontose2 > pontose1)
		{
			return resultadoPartidaIndvIndividual(competidor2.getAtletas().getNome(), competidor1.getAtletas().getNome(), pontose2, pontose1);
		}
		
		return "a";
	}
	
}
