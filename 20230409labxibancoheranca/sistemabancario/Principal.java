package sistemabancario;

public class Principal {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Carlos", new ContaPoupanca(100, "0001"));
		Cliente cliente2 = new Cliente("Jonir", new ContaPoupanca(100, "0002"));
		Cliente cliente3 = new Cliente("Juvenal", new ContaPoupanca(100, "0003"));
		Cliente cliente4 = new Cliente("Herculano", new ContaCorrente(100, "0004"));
		
		Banco.sacaValorViaNumeroConta("0001", 30);
		Banco.depositaViaNome("Carlos", 34);
		System.out.println(cliente1.getConta().getSaldo());

	}

}
