package entidades;

public class EquipeNadoSincronizado extends Equipe{
	
	private int tam = 4;
	
	public EquipeNadoSincronizado(String string, Atleta ... atletas) {
		super(string, atletas);
	}

}
