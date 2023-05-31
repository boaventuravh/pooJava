package controller;

import java.util.ArrayList;

import javax.swing.ButtonModel;

import model.Campeonato;
import model.Jogador;

public class CampeonatoController {
	
	private Campeonato campeonato;
	
	

	public void iniciarCampeonato(Campeonato campeonato, String titulo, int dificuldade, int velocidade) {
		
		campeonato = new Campeonato(titulo, dificuldade, velocidade);
		
	}
	
	public Jogador registrarJogador(String nome, String apelido) {
		
		Jogador jogador = new Jogador(nome, apelido);
		return jogador;
		
	}
	
	public void addJogador(Campeonato campeonato, ArrayList<Jogador> jogadores) {
		
		for(int index = jogadores.size(); index>=0; index--) {
			campeonato.addJogadorCampeonato(jogadores.get(index));
		}
	}
	
	
}