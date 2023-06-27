package model;

import java.util.ArrayList;
import java.util.List;

public class Jogador {
	
	private String nome;
	private String apelido;
	private int pontos;
	private Sequencia sequencia;
	
	public Jogador(String nome, String apelido) {
		this.nome = nome;
		this.apelido = apelido;
		this.sequencia = new Sequencia();
		pontos = 0;
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
	
	public void addPonto() {
		this.pontos += 1;
	}	

	public Sequencia getSequencia() {
		return sequencia;
	}
}
