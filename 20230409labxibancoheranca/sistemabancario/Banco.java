package sistemabancario;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private static List<Cliente> clientes = new ArrayList<Cliente>(); 

	public Banco() {
		
	}
	
	public static void depositaViaNome(String nome, double valor) {
		
		for(Cliente cliente : clientes) {
			if(cliente.getNome() == nome) {
				cliente.getConta().depositaValor(valor);
				break;
			}				
		}
	}
	
	public static void depositaViaNumeroConta(String numero, double valor) {
		
		for(Cliente cliente : clientes) {
			if(cliente.getConta().getNumero() == numero) {
				cliente.getConta().depositaValor(valor);
				break;
			}				
		}
	}
	
	public static void sacaValorViaNome(String nome, double valor) {
			
		for(Cliente cliente : clientes) {
			if(cliente.getNome() == nome) {
				cliente.getConta().sacaValor(valor);
				break;
			}				
		}
	}
	
	public static void sacaValorViaNumeroConta(String numero, double valor) {
		
		for(Cliente cliente : clientes) {
			if(cliente.getConta().getNumero() == numero) {
				cliente.getConta().sacaValor(valor);
				break;
			}				
		}
	}
	
	public static void getValorViaNome(String nome) {
		
		for(Cliente cliente : clientes) {
			if(cliente.getNome() == nome) {
				cliente.getConta().getSaldo();
				break;
			}				
		}
	}
	
	public static void getValorViaNumeroConta(String numero) {
		
		for(Cliente cliente : clientes) {
			if(cliente.getConta().getNumero() == numero) {
				cliente.getConta().getSaldo();
				break;
			}				
		}
	}
	
	public static double getValorTotal() {
		double valorTotal = 0;
		for(Cliente cliente : clientes) {
			valorTotal += cliente.getConta().getSaldo();
		}
		return valorTotal;
	}
	
	public static void addCliente(Cliente cliente) {
		clientes.add(cliente);
	}

}
