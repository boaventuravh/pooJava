package client;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientEchoes {

	public static void main(String[] args) throws UnknownHostException, IOException {
		
		Socket client = new Socket("10.133.15.1", 1234); // IP da máquina do professor durante a aula
		PrintWriter esc;
		esc = new PrintWriter(client.getOutputStream(), true);
		
		Scanner ler;
		ler = new Scanner(client.getInputStream());
		esc.println("My name is Miles Morales!");
		String respostaServidor=ler.nextLine();
		System.out.println(respostaServidor);

	}

}
