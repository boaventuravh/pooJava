package model;

import java.util.ArrayList;
import java.util.List;

public class Rodada {
	
	private List<Jogador> jogadoresRodada;
	private List<Jogada> jogadas;
	
	public Rodada() {
		jogadoresRodada = new ArrayList<Jogador>();
		jogadas = new ArrayList<Jogada>();
	}
	
	public List<Jogador> getJogadores() {
		return jogadoresRodada;
	}
	
	public void setJogadores(List<Jogador> jogadores) {
		this.jogadoresRodada = jogadores;
	}
	
	public List<Jogada> getJogadas() {
		return jogadas;
	}
	
	public void setJogadas(List<Jogada> jogadas) {
		this.jogadas = jogadas;
	}
	
	

}
