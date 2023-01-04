import java.util.Scanner;

public class Tabuada {
	
	public static void main (String[] args) {
        Scanner leitor = new Scanner(System.in);
        int cont = 0;

		System.out.println("GERADOR DE TABUADA");
		System.out.println("Digite um número entre 1 e 10 para ver a sua tabuada: ");
		int numero = leitor.nextInt();
		
		while (cont < 10) {
			cont++;
			int resultado = numero * cont;
			System.out.println(numero + " x " + cont + " = " + resultado);
		}
		
	}
	
}