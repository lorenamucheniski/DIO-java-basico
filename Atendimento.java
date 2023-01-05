import java.util.Scanner;

public class Atendimento {
	
	public static void main (String[] args) {
		int c = 1;
		
		String[] nomesFila = new String[3]; 
		Scanner nome = new Scanner(System.in);
		
		for (int i = 0; i < nomesFila.length; i ++) {
			System.out.println("Digite o " + (i + 1) + " º nome: ");
			nomesFila[i] = nome.next();				
		} 
		for (String mostrar: nomesFila){
			System.out.println(mostrar + " - esta na posição: " + c);
			c++;		
		}				
    }	
}