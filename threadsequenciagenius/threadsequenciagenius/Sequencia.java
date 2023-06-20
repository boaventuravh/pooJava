package threadsequenciagenius;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Sequencia extends Thread {
	
	private String sequencia;
	private String sequenciaUser;
	private boolean correto;
	
	public Sequencia() {
		sequencia = "";
		correto = true;
	}
	
	public void run() {
		Random random = new Random();
		int number = random.nextInt(4);
		sequencia += number;
		System.out.print("Sequência: ");
		System.out.print(sequencia);
			
		System.out.println(" ");
		boolean resultado = confereSequenciaUsuario(sequencia); 
		if(resultado)
			run();
		
		else
			System.out.println("Errrouu!!!!");
	}
	
	public boolean confereSequenciaUsuario(String sequencia) {
		Scanner scanner = new Scanner(System.in);
		sequenciaUser = "";
		System.out.println("Digite: ");
		sequenciaUser = scanner.nextLine();
		return(sequencia.equals(sequenciaUser));
	}
}
