package br.ufc.crateus.web.aula05.model;

public class Passagem {
	private String nome;
	private String email;
	private String telefone;
	private String rg;
	private String data;
	private String hora;
	private String origem;
	private String destino;
	private String bandeiraCartao;
	private String numeroCartao;
	private String validadeCartao;
	
	public Passagem() {
	}

	public Passagem(String nome) {
		setNome(nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getBandeiraCartao() {
		return bandeiraCartao;
	}

	public void setBandeiraCartao(String bandeiraCartao) {
		this.bandeiraCartao = bandeiraCartao;
	}

	public String getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public String getValidadeCartao() {
		return validadeCartao;
	}

	public void setValidadeCartao(String validadeCartao) {
		this.validadeCartao = validadeCartao;
	}

	@Override
	public String toString() {
		return "Passagem [nome=" + nome + ", email=" + email + ", telefone=" + telefone + ", rg=" + rg + ", data="
				+ data + ", hora=" + hora + ", origem=" + origem + ", destino=" + destino + ", bandeiraCartao="
				+ bandeiraCartao + ", numeroCartao=" + numeroCartao + ", validadeCartao=" + validadeCartao + "]";
	}
}
