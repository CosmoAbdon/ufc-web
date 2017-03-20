package br.ufc.crateus.web.oo1.entidades;

public class Carta {

	private String valor;
	private Naipe naipe;
	
	public Carta(String valor, Naipe naipe) {
		this(valor);
		setNaipe(naipe);
	}
	
	public Carta(String valor){
		setValor(valor);
	}
	
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public Naipe getNaipe() {
		return naipe;
	}
	public void setNaipe(Naipe naipe) {
		this.naipe = naipe;
	}
}
