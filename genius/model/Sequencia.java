package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Sequencia extends Thread {	
	
	
	private HashMap<Integer, String> cores = new HashMap<>(){{
	    put(1, "verde");
	    put(2, "amarelo");
	    put(3, "azul");
	    put(4, "vermelho");
	}};;
	
	private ArrayList<Integer> sequenciaCores = new ArrayList<Integer>();
	
	public Sequencia() {
		sequenciaCores = new ArrayList<Integer>();		
	}

	public void addRandomToSequencia() {
		Random random = new Random();
		this.sequenciaCores.add(random.nextInt(4) + 1);
	}
	
	public void addToSequencia(int idCor) {
		this.sequenciaCores.add(idCor);
	}
	
	public boolean confereSequencia (ArrayList<Integer> sequenciaUser) {
		
		return sequenciaUser.equals(this.sequenciaCores);
		
	}

	public ArrayList<Integer> getSequenciaCores() {
		return sequenciaCores;
	}

	public void setSequenciaCores(ArrayList<Integer> sequenciaCores) {
		this.sequenciaCores = sequenciaCores;
	}

	public HashMap<Integer, String> getCores() {
		return cores;
	}
	
	
	

}