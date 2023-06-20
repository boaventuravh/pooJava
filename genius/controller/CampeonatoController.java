package controller;

import java.util.ArrayList;

import javax.swing.ButtonModel;

import model.Campeonato;
import model.Jogador;

public class CampeonatoController {
	
	private Campeonato campeonato;
	
	public CampeonatoController() {}
	
	public CampeonatoController(Campeonato campeonato) {
		this.campeonato = campeonato;
	}

	public void iniciarCampeonato(String titulo, int qtdJogadores, int dificuldade, int velocidade) {
		
		this.campeonato = new Campeonato(titulo, qtdJogadores, dificuldade, velocidade);
		
	}
	
	public void registrarJogador(String nome, String apelido) {
		
		Jogador jogador = new Jogador(nome, apelido);
		this.campeonato.addJogadorCampeonato(jogador);		
	}
	
	public Campeonato getCampeonato() {
		return campeonato;
	}

	public void setCampeonato(Campeonato campeonato) {
		this.campeonato = campeonato;
	}

	public void addJogador(Campeonato campeonato, Jogador jogador) {
		
		campeonato.addJogadorCampeonato(jogador);
	}
	
	
}