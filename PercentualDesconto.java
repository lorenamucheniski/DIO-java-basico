import java.util.Scanner;

public class PercentualDesconto{
	
	public static void main (String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		
		System.out.println("Digite o valor normal do produto: ");
		float M = leitor.nextFloat();
		System.out.println("Digite o valor com o desconto do produto: ");
		float D = leitor.nextFloat();
		
		float resultado = (M - D) / M * 100; 
		int porcentagem = (int) Math.round(resultado);
		
		 System.out.print("O desconto foi de " + porcentagem + "%");
		
	}
	
}