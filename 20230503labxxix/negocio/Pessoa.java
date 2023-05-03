package negocio;

import java.util.ArrayList;
import java.util.List;

public abstract class Pessoa {
	
	private String nome;
	private List<Pessoa> subordinados = new ArrayList<Pessoa>();
	private List<Pessoa> superiores = new ArrayList<Pessoa>();
	private Pessoa chefe;
	
	
	
	public Pessoa(String nome, Pessoa chefe) {
		this.nome = nome;
		this.chefe = chefe;
	}
	
	public String getNome() {
		return nome;
	}
	public List<Pessoa> getSubordinadosDiretos() {
		return subordinados;
	}
	public Pessoa getChefe() {
		return chefe;
	}
	
	public List<Pessoa> getSuperiores() {
		return superiores;
	}

	public abstract List<Pessoa> getListaEmpregadosAssociados();
	
	public abstract List<Pessoa> getListaSuperiores();

}
