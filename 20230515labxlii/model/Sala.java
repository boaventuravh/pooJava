package model;

public abstract class Sala {
	
	private String codSala;
	private int qtdeLugares;
	
	public Sala(String codSala) {
		this.codSala = codSala;
	}
	
	public Sala() {}
	

	public int getQtdeLugares() {
		return qtdeLugares;
	}

	public void setQtdeLugares(int qtdeLugares) {
		this.qtdeLugares = qtdeLugares;
	}

}
