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

	public void addJogador(Jogador jogador) {
		this.jogadoresRodada.add(jogador);
		
	}
	
//	public void addJogadoresRodada(Campeonato campeonato) {
//		
//		for(Jogador jo : campeonato.getJogadoresCampeonato())
//		{
//			if (jo.isAtivo())
//				this.addJogador(jo);
//		}
//		
//	}
	
//	public void aconteceRodada(Jogador jogador, int contador, boolean ganhou) {
//		
//		contador = this.getJogadores().size() - 1;
//		if(contador < this.getJogadores().size())
//		{
//			if(ganhou)
//				jogador.setPontos(jogador.getPontos()+1);
//			
//			else
//				jogador.setAtivo(false);
//			
//			contador++;
//		}
//		
//	}
	
	

}
