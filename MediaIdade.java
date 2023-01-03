import java.util.Scanner;

public class MediaIdade {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira a primeira idade: ");
        int idade1 = leitor.nextInt();
        System.out.println("Insira a segunda idade: ");
        int idade2 = leitor.nextInt();
        System.out.println("Insira a terceira idade: ");
        int idade3 = leitor.nextInt();
       
        float media = (idade1 + idade2 + idade3) / 3;
        
        if (media > 0 && media <= 25) {
        	System.out.println("A média de idade da turma é de " + media + ", sendo assim uma turma Jovem!");
        } else if (media >= 26 && media <= 60) {
        	System.out.println("A média de idade da turma é de " + media + ", sendo assim uma turma Adulta!");
        } else {
        	System.out.println("A média de idade da turma é de " + media + ", sendo assim uma turma Idosa");
        }
     
        
        }
 }   