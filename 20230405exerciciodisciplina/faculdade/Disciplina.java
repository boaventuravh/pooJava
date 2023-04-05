package faculdade;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
	
	private String codigo;
	private String nome;
	private List<Aluno> alunosMatriculados = new ArrayList();
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void matriculaAluno (Aluno aluno) {
		
		if (alunosMatriculados.size() == 40) {
			System.out.println("Não há mais vagas!");
		}
		else {
			alunosMatriculados.add(aluno);
			aluno.adicionaDisciplina(this);
		}
			
		
	}
	
	public int getQuantidadeAlunos() {
		
		if (alunosMatriculados == null)
			return 0;
		
		return alunosMatriculados.size();
		
	}
	
	public void listarAlunos () {
		if (alunosMatriculados == null)
			System.out.println("Não há aulunos matriculados");
		
		else {
			for(Aluno aluno : alunosMatriculados) {
				System.out.println("Nome: " + aluno.getNome() + ", matrícula: " + aluno.getMatricula());
			}
		}
	}

}
