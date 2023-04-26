package sistemabancario;

public class Cliente {

	public Cliente(String nome, Conta conta) {		
		this.nome = nome;
		this.conta = conta;
		Banco.addCliente(this);
	}

	private String nome;
	private Conta conta;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public Cliente() {
		
	}

}
