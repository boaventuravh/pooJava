package pesquisa;

import java.util.ArrayList;

public abstract class Pesquisador {
	
	public String nome;
	public ArrayList<Pesquisador> supervisionados;
	public Pesquisador coordenador;
	
	Pesquisador(){};
	
	Pesquisador(String nome, Pesquisador coordenador ){
		this.nome = nome;
		this.coordenador = coordenador;
		this.supervisionados = new ArrayList<>();		
	};
	
	public String getNome() {
		return this.nome;
	}
	
	public abstract void addSupervisionado(String nome) throws ProfessorNaoTemSupervisionadoException;
	
	public abstract double getValor();
	
	public int getQtdSupervisionados() {
				
		int qtdAtual = this.supervisionados.size();
		
		
		
		return this.supervisionados.size();
	}
	
	public Pesquisador getCoordenador() {
		return this.coordenador;
	}
	
	public void listarSuperiores() {
		Pesquisador coordenadorAtual = this.getCoordenador();
		if(coordenadorAtual != null) {
			System.out.println(coordenadorAtual.getNome() + "\n");
		}
	}
	
	
}
