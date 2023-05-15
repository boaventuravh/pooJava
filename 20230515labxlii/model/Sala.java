package model;

public abstract class Sala {
	
	private String nome;
	private int qtdeLugares;
	
	public Sala(String nome) {
		this.nome = nome;
	}
	
	public Sala() {}
	
	public abstract boolean vendeBilhete();

	public int getQtdeLugares() {
		return qtdeLugares;
	}

	public void setQtdeLugares(int qtdeLugares) {
		this.qtdeLugares = qtdeLugares;
	}

}
