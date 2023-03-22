package estruturasdinamicas;

import java.util.ArrayList;
import java.util.HashMap;

public class Principal {

	public static void main(String[] args) {

		//Declaração de uma lista dinâmica do tipo ArrayList
		ArrayList<String> listaDinamica = new ArrayList<String>();
		
		listaDinamica.add("Primeiro");
		listaDinamica.add("Segundo");
		listaDinamica.add(1, "Um e meio");
		
		for(String i : listaDinamica) {
			System.out.print("\n" + i);
		}
		
		//HashMap (também conhecido como Dicionário)
		
		HashMap<String, String> arvore = new HashMap<String, String>();

	}

}
