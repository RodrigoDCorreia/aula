import java.util.Scanner;

public class Aritmetica {
	public static void main(String[] args) {
		int n1;  // primeiro número solicitado
		int n2;  // segundo número solicitado
		int soma;  // soma dos dois números
		int diferenca;
		int produto;
		
		
		// Pedir 2 números para o usuário
		// Cria um objeto de Scanner que lê
		// da entrada padrão (System.in);
		Scanner entrada = new Scanner(System.in);
		// Carregar esses números como inteiros
		System.out.print("Insira o primeiro numero: ");
		n1 = entrada.nextInt();
		
		System.out.print("Insira o segundo numero: ");
		n2 = entrada.nextInt();
		
		entrada.close();
		// Somar os dois números
		soma = n1 + n2;
		diferenca = n1 - n2;
		produto = n1 / n2;
		// Imprimir a soma
		System.out.printf("Soma: %d\n", soma);
		System.out.printf("Diferenca: %d\n", diferenca);
		System.out.printf("Produto: %d\n", produto);
		
		
		
	}
}
