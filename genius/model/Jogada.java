package model;

public class Jogada {
	
	private double tempoJogada;
	private boolean acertou;
	private Sequencia sequencia; 
	
	public Jogada() {
		tempoJogada = 0;
		acertou = true;
	}
	
	public Jogada(Sequencia sequencia) {
		tempoJogada = 0;
		acertou = true;
		this.sequencia = sequencia;
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
	
	public void setAcertou(boolean resultado) {
		this.acertou = resultado;
	}

	public Sequencia getSequencia() {
		return sequencia;
	}

	public void setSequencia(Sequencia sequencia) {
		this.sequencia = sequencia;
	}
	

}
