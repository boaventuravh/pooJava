package pesquisa;

import java.util.ArrayList;

public abstract class Pesqisador {
	
	public String nome;
	public ArrayList<Pesqisador> supervisionados = new ArrayList<Pesqisador>();
	public Pesqisador coordenador;
	
	Pesqisador(){};
	
	Pesqisador(String nome, ArrayList<Pesqisador> supervisionados ){
		this.nome = nome;
		//Eu acho que esse construtor tá muito errado
		for(Pesqisador item : supervisionados) {
			this.supervisionados = supervisionados;
		}
	};
	
	
}
