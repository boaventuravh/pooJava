package controller;

import java.util.ArrayList;

import javax.swing.ButtonModel;

import model.Campeonato;
import model.Jogador;

public class CampeonatoController {
	
	private Campeonato campeonato;
	
	

	public void iniciarCampeonato(Campeonato campeonato, String titulo, int qtdJogadores, int dificuldade, int velocidade) {
		
		campeonato = new Campeonato(titulo, qtdJogadores, dificuldade, velocidade);
		
	}
	
	public Jogador registrarJogador(String nome, String apelido) {
		
		Jogador jogador = new Jogador(nome, apelido);
		return jogador;
		
	}
	
	public void addJogador(Campeonato campeonato, Jogador jogador) {
		
		campeonato.addJogadorCampeonato(jogador);
	}
	
	
}