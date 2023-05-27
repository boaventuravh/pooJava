package model;

public class Jogada {
	
	private double tempoJogada;
	private boolean acertou;
	
	public Jogada() {
		tempoJogada = 0;
	}
	
	public double getTempoJogada() {
		return tempoJogada;
	}
	
	public void setTempoJogada(double tempoJogada) {
		this.tempoJogada = tempoJogada;
	}
	
	public boolean isAcertou() {
		return acertou;
	}
	
	public void setAcertou(boolean acertou) {
		this.acertou = acertou;
	}

}
