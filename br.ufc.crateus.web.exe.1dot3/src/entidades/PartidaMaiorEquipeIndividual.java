package entidades;

public class PartidaMaiorEquipeIndividual extends Partida{

	private int pontose1;
	private int pontose2;
	private Equipe equipe1;
	private Equipe equipe2;
	
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
	public Equipe getEquipe1() {
		return equipe1;
	}
	public void setEquipe1(Equipe equipe1) {
		this.equipe1 = equipe1;
	}
	public Equipe getEquipe2() {
		return equipe2;
	}
	public void setEquipe2(Equipe equipe2) {
		this.equipe2 = equipe2;
	}

	@SuppressWarnings("unused")
	public String getResultadoPartidaEquipeIndividual()
	{
		if(pontose1 > pontose2)
		{
			return resultadoPartidaEquipeIndividual(equipe1.getNomeEquipe(), equipe2.getNomeEquipe(), pontose1, pontose2);
		}else if(pontose2 > pontose1)
		{
			return resultadoPartidaEquipeIndividual(equipe2.getNomeEquipe(), equipe1.getNomeEquipe(), pontose2, pontose1);
		}
		
		return "a";
	}
	
}
