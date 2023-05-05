package sistemabancario;

public abstract class Conta {
	
	protected double saldo;
	private String numero;
	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Conta (double saldoInicial, String numero) {
		this.saldo = saldoInicial;
		this.numero = numero;
	}
	
	public void depositaValor (double valor) {
		if(valor > 0) {
			this.saldo += valor;
			System.out.println("Valor de R$" + valor + " depositado com sucesso na conta " + this.numero);
		}
		else {
			System.out.println("Valor inválido!");
		}
	}
	
	public void sacaValor(double valor) {
		if(valor > this.saldo)
			System.out.println("Operação inválida!");
		else {
			this.saldo -= valor;
			System.out.println("Valorde R$" + valor + " sacado com sucesso da conta " + this.numero);
		}
	}

	public double getSaldo() {
		return saldo;
	}

	public abstract void atualizaSaldoMensal();

}
