package faculdade;

import java.util.ArrayList;
import java.util.List;

public class Faculdade {
	
	private static List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	
	public static void cadastraDisciplina (Disciplina disciplina) {
		disciplinas.add(disciplina);
	}
	
	public void listarDisciplinas() {
		for (Disciplina disciplina : disciplinas)
			System.out.println("Nome: " + disciplina.getNome() + ", código: " + disciplina.getCodigo());
	}
	
	public List<Disciplina> getDisciplinaComMaisAlunos() {
		int tamanho = disciplinas.get(0).getQuantidadeAlunos();
		List<Disciplina> maioresQuantidadesAlunos = new ArrayList<Disciplina>();
		for(Disciplina disciplina : disciplinas)
			if(disciplina.getQuantidadeAlunos() > tamanho)
				maioresQuantidadesAlunos.add(disciplina);
		
		return maioresQuantidadesAlunos;
	}

}
