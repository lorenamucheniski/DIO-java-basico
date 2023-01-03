import java.util.Scanner;

public class ImparPar {
	
	public static void main (String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		int cont = 0;
		int quantPar = 0;
		int quantImpar = 0;
		
		System.out.println("Digite 10 números: ");
		while (cont < 10) {
			int numero = leitor.nextInt();
			cont ++;
			
			if (numero % 2 == 0) quantPar ++;
			else quantImpar ++;
		} 
		
		System.out.println(quantPar + " números são pares.");
		System.out.println(quantImpar + " números são ímpars.");
	}
		
}
	