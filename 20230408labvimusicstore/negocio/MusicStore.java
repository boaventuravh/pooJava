package negocio;

import java.time.LocalTime;

public class MusicStore {
	
	private String nomeLoja;
	private String ownwer = "sem dono";
	private LocalTime horaAbertura = LocalTime.parse("09:00");
	private LocalTime horaFechamento = LocalTime.parse("21:00");
	
	
	
	public String getOwnwer() {
		return ownwer;
	}

	public void setOwnwer(String ownwer) {
		this.ownwer = ownwer;
	}

	public MusicStore(String nome) {		
		this.nomeLoja = nome;
	}
	
	public String getNome() {
		return nomeLoja;
	}
	public void setNome(String nome) {
		this.nomeLoja = nome;
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
	
	public void displayOwner() {
		System.out.println("Propietário: " + this.getOwnwer());
	}
	
	
}
