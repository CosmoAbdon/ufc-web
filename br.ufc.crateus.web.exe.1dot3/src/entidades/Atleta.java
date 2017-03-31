package entidades;

public class Atleta implements IAtleta{
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Atleta(String nome) {
		this.nome = nome;
	}
	
	public Atleta()
	{
		super();
	}
	
	public String toStringNome()
	{
		return this.nome;
	}
	
	@Override
	public String getNomeExibicao() {
	return getNome();
	}

}
