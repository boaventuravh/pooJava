package model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Campeonato {
	
	private String titulo;
	private LocalDateTime data;
	private List<Rodada> rodadas;
	private List<Jogador> jogadoresCampeonato;
	private int qtdJogadores;
	private int dificuldade;
	private int velocidade;
	
	public Campeonato(String titulo, int qtdJogadores, int dificuldade, int velocidade) {
		this.titulo = titulo;
		this.data = LocalDateTime.now();
		this.jogadoresCampeonato = new ArrayList<Jogador>(qtdJogadores);
		this.qtdJogadores = qtdJogadores;
		this.rodadas = new ArrayList<Rodada>();
		this.dificuldade = dificuldade;
		this.velocidade = velocidade;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public LocalDateTime getData() {
		return data;
	}
	
	public void setData(LocalDateTime data) {
		this.data = data;
	}
	
	public List<Rodada> getRodadas() {
		return rodadas;
	}
	
	public void setRodadas(List<Rodada> rodadas) {
		this.rodadas = rodadas;
	}
	
	public List<Jogador> getJogadoresCampeonato() {
		return jogadoresCampeonato;
	}
	
	public void setJogadoresCampeonato(List<Jogador> jogadoresCampeonato) {
		this.jogadoresCampeonato = jogadoresCampeonato;
	}
	
	public void addJogadorCampeonato(Jogador jogador) {
		this.jogadoresCampeonato.add(jogador);
	}

	public int getQtdJogadores() {
		return qtdJogadores;
	}

	public void setQtdJogadores(int qtdJogadores) {
		this.qtdJogadores = qtdJogadores;
	}

	public int getDificuldade() {
		return dificuldade;
	}
	
	public void setDificuldade(int dificuldade) {
		this.dificuldade = dificuldade;
	}
	
	public int getVelocidade() {
		return velocidade;
	}
	
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
}
