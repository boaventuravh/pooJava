package arvoregenealogica;

import java.util.ArrayList;
import java.util.List;

import exceptions.NatimortoNaoTemFilhoException;

public abstract class Pessoa {
	
	private Pessoa pai;
	private String nome;
	private List<Pessoa> descendentes;
	
	public Pessoa(Pessoa pai, String nome) {
		super();
		this.pai = pai;
		this.nome = nome;
		this.descendentes= new ArrayList<Pessoa>();
	}
	
	public void listarDescendentes() {
		for (Pessoa pessoa : descendentes) {
			System.out.println(pessoa.getNome());
			pessoa.listarDescendentes();
		}
	}
	
	public void listarAscendentes() {
		Pessoa paiAtual=this.getPai();
		if(paiAtual!=null) {
			System.out.println(paiAtual.getNome());
			paiAtual.listarAscendentes();
		}
	}
	
	
	public abstract void addDescendentes(String nome, String sexo) throws NatimortoNaoTemFilhoException;

	public Pessoa getPai() {
		return pai;
	}

	public String getNome() {
		return nome;
	}

	public List<Pessoa> getDescendentes() {
		return descendentes;
	}
	
	
	public int getQtdFilhos() {
		int qtd=0;
		for (Pessoa pessoa : descendentes) {
			if(pessoa instanceof Filho) {
				qtd++;
			}
		}
		return qtd;
	}
	
	

}
