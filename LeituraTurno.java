import java.util.Scanner;

public class LeituraTurno {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Em qual turno você estuda? Digite M - matutino ou V - vespertino ou N - noturno.");
        char turno = leitor.next().toUpperCase().charAt(0);
        
        switch (turno) {
        	case 'M':
            	System.out.println("Bom dia!");
            	break;
        	case 'V':
        		System.out.println("Boa tarde!");
        		break;
        	case 'N':
        		System.out.println("Boa noite!");
        		break;
        }
            
     }
}