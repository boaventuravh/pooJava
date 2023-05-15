package model;

import java.time.LocalTime;

public class Bilhete {
	
	private double preco;
	private LocalTime horario;
	
	public Bilhete(double preco, LocalTime horario) {
		this.preco = preco;
		this.horario = horario;
	}
	
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public LocalTime getHorario() {
		return horario;
	}
	public void setHorario(LocalTime horario) {
		this.horario = horario;
	}
	

}
