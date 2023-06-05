package model;

import java.util.ArrayList;
import java.util.List;

public class Jogador {
	
	private String nome;
	private String apelido;
	private int pontos;
	private List<Jogada> jogadas;
	private boolean acertou;
	
	public Jogador() {}
	
	public Jogador(String nome, String apelido) {
		this.nome = nome;
		this.apelido = apelido;
		pontos = 0;
		acertou = true;
		jogadas = new ArrayList<Jogada>();
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getApelido() {
		return apelido;
	}
	
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	
	public int getPontos() {
		return pontos;
	}
	
	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	
	public List<Jogada> getJogadas() {
		return jogadas;
	}
	
	public void setJogadas(List<Jogada> jogadas) {
		this.jogadas = jogadas;
	}
	
	public boolean isAtivo() {
		return acertou;
	}
	
	public void setAtivo(boolean ativo) {
		this.acertou = ativo;
	}
	
}
