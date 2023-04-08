package negocio;

import java.time.LocalTime;

public class MusicStore {
	
	private String nome;
	private LocalTime horaAbertura = LocalTime.parse("09:00");
	private LocalTime horaFechamento = LocalTime.parse("21:00");
	
	
	
	public MusicStore(String nome) {		
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalTime getHoraAbertura() {
		return horaAbertura;
	}
	public void setHoraAbertura(LocalTime horaAbertura) {
		this.horaAbertura = horaAbertura;
	}
	public LocalTime getHoraFechamento() {
		return horaFechamento;
	}
	public void setHoraFechamento(LocalTime horaFechamento) {
		this.horaFechamento = horaFechamento;
	}
	
	public void displayHoursOfOperation() {
		System.out.println("Horário de funcionamento: das " + horaAbertura + " às " + horaFechamento);
	}
	
	
}
