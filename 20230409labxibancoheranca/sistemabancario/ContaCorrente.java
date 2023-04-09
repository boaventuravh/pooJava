package sistemabancario;

public class ContaCorrente extends Conta {

	public ContaCorrente(double saldoInicial, String numero) {
		super(saldoInicial, numero);
	}
	
	public void atualizaSaldoMensal() {
		this.saldo -= 1;
	}

}
