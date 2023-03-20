package chefesfuncionarios;

import java.util.Date;

public class Funcionario extends Pessoa {

	public Chefe superior;
	
	Funcionario(){};
	
	Funcionario(Chefe superior, String nome, Date nascimento){
		
		this.nome = nome;
		this.nascimento = nascimento;
		this.superior = superior;
		
	};
	
	public void setSuperior(Chefe superior){
		this.superior = superior;
	}
	
	public Chefe getSuperior(){
		return this.superior;
	}
	
}
