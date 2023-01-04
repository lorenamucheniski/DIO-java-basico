import java.util.Scanner;

public  class Fatorial {
	
	public static void main (String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite um número para ver seu fatorial: ");
		int numero = leitor.nextInt();
		
		int multiplicacao = 1;
		
		for (int c = numero; c >= 1 ; c--) {
			multiplicacao = multiplicacao * c;
		}
		
		System.out.println("O fatorial de " + numero + " é igual à" + multiplicacao);				
		
	}
	
}