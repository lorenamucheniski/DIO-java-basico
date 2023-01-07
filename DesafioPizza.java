import java.util.Scanner;

public class DesafioPizza {
	
	 public static void main(String[] args) {
		    final int SLICE = 4;
		    Scanner input = new Scanner(System.in);
		    
		    int i = 0;
		    
		    System.out.println("Quantos testes? ");
		    int T = input.nextInt();
		    while (i < T) {
		    	i++;
		    	System.out.println("Quantas pessoas? ");
		    	float pessoas = input.nextInt();
		    	System.out.println("Quantos pedacos? ");
		    	float pedaco = input.nextInt();
		    	
		    float A = (pessoas * pedaco)/ SLICE;
		    int B = (int)Math.ceil(A);
		    
		    System.out.println("Serão nescessárias " + B + " pizzas.");
		    } 	
		    
		    
		    
		    
 
	 }
}