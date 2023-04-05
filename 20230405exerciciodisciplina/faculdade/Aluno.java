package faculdade;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	
	private String nome;
	private String matricula;
	private String semestreDeIngresso;
	private List<Disciplina> disciplinas = new ArrayList();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getSemestreDeIngresso() {
		return semestreDeIngresso;
	}
	public void setSemestreDeIngresso(String semestreDeIngresso) {
		this.semestreDeIngresso = semestreDeIngresso;
	}
	public void adicionaDisciplina (Disciplina disciplina) {
		this.disciplinas.add(disciplina);
	}
	
	

}
