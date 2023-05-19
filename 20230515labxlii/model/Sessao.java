package model;

import java.time.LocalTime;

public class Sessao {
	
	private Sala sala;
	private LocalTime horario;
	private String turno;
	private double preco;
	private double qtdeIngressosDisponiveis;
	
	
	public Sala getSala() {
		return sala;
	}
	public void setSala(Sala sala) {
		this.sala = sala;
	}
	public LocalTime getHorario() {
		return horario;
	}
	public void setHorario(LocalTime horario) {
		this.horario = horario;
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public double getQtdeIngressosDisponiveis() {
		return qtdeIngressosDisponiveis;
	}
	public void setQtdeIngressosDisponiveis(double qtdeIngressosDisponiveis) {
		this.qtdeIngressosDisponiveis = qtdeIngressosDisponiveis;
	}
	
	
	

}
