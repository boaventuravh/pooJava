package testandogit;

public class Humano {
	
	public String nome;
	public double alturaMetro;
	public double pesoKg;
	public String etnia;
	
	Humano(){}
	
	Humano (String nome, double alturaMetro, double pesoKg, String etnia){
		this.nome = nome;
		this.alturaMetro = alturaMetro;
		this.pesoKg = pesoKg;
		this.etnia = etnia;
	}
	
	public String getNome (Humano humano) {
		return humano.nome;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public double getAltura (Humano humano) {
		return humano.alturaMetro;
	}
	
	public void setAltura (double alturaMetro) {
		this.alturaMetro = alturaMetro;
	}
	
	public double getPeso (Humano humano) {
		return humano.pesoKg;
	}
	
	public void setPeso (double pesoKg) {
		this.pesoKg = pesoKg;
	}
	
	public String getEtnia (Humano humano) {
		return humano.etnia;
	}
	
	public void setEtnia (String etnia) {
		this.etnia = etnia;
	}
	
	public void mostraFichaHumano() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Altura: " + this.alturaMetro + " metros");
		System.out.println("Peso: " + this.pesoKg + " Kg");
		System.out.println("Etnia: " + this.etnia);
	}

}
