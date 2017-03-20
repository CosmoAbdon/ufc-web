package br.ufc.crateus.web.oo1.entidades;

public class Partida {
	
	private Jogador j1;
	private int pontosJ1;
	private Jogador j2;
	private int pontosJ2;
	
	public Jogador getJ1() {
		return j1;
	}
	public void setJ1(Jogador j1) {
		this.j1 = j1;
	}
	public int getPontosJ1() {
		return pontosJ1;
	}
	public void setPontosJ1(int pontosJ1) {
		this.pontosJ1 = pontosJ1;
	}
	public Jogador getJ2() {
		return j2;
	}
	public void setJ2(Jogador j2) {
		this.j2 = j2;
	}
	public int getPontosJ2() {
		return pontosJ2;
	}
	public void setPontosJ2(int pontosJ2) {
		this.pontosJ2 = pontosJ2;
	}
	
	public Jogador getVencedor(){
		return pontosJ1 > pontosJ2 ? j1 : j2;
	}
	
}
