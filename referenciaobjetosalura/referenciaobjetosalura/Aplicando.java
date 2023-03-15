package referenciaobjetosalura;

public class Aplicando {

	public static void main(String[] args) {

		ObjetosTeste referencia1 = new ObjetosTeste();
		ObjetosTeste referencia2 = referencia1;
		
		referencia2.atributo = 1;
		
		System.out.println(referencia1.atributo);

	}

}
 
// Na apostila da Alura de POO com Java, aprendi que igualar duas referências
// a objeto significa que ambas apontarão para um mesmo endereço de memória,
// onde está armazenado o objeto instanciado. Criei esse projeto para testar
// isso.