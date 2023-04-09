package sistemabancario;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(double saldoInicial, String numero) {
		super(saldoInicial, numero);		
	}
	
	public void atualizaSaldoMensal() {
		this.saldo += this.saldo*0.01;
	}

}
