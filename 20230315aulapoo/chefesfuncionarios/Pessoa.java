package chefesfuncionarios;

import java.util.Date;

public class Pessoa {
	
	public String nome;
	public Date nascimento;
	
	Pessoa(){};
	
	Pessoa(String nome, Date nascimento){
		this.nome = nome;
		this.nascimento = nascimento;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public Date getNascimento() {
		return this.nascimento;
	}

}
