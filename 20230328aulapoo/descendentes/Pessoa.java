package descendentes;

import java.util.ArrayList;

public abstract class Pessoa {
	
	private String nome;
	private Pessoa pai;
	private ArrayList<Pessoa> listaDescendentes = new ArrayList<Pessoa>();
	private static ArrayList<ArrayList<Pessoa>> linhagem = new ArrayList<ArrayList<Pessoa>>();
	
	
	public abstract void cadastrarFilho(Pessoa filho);


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Pessoa getPai() {
		return pai;
	}


	
}
