package Set;

import java.util.*;


public class ExemploSet {
     public static void main(String[]args){

         System.out.println("Crie um conjunto de notas: ");
         Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
         System.out.println(notas);

         System.out.println("Confira se a nota 5.0 está no conjunto: " + notas.contains(5d));

         System.out.println("Exiba a menor nota: " + Collections.min(notas));

         System.out.println("Exiba a maior nota: " + Collections.max(notas));

         System.out.print("Exiba a soma dos valores: "); //assim como na list é nescessário usar o iterator para realizar a soma dos elementos dentro do conjunto
         Iterator<Double> iterator = notas.iterator();
         Double soma = 0.0;
         while ((iterator.hasNext())){
             Double next = iterator.next();
             soma += next;
         }
         System.out.println(soma);

         System.out.println("Exiba a média das notas: " + (soma/ notas.size()));
         /*para sabermos a média é preciso dividir a soma pela quantidade de notas;
         para sabermos quantas notas tem o nosso conjunto usamos o size;
          */

         System.out.print("Remova a nota 0: ");
         notas.remove(0d);
         System.out.println(notas);

         System.out.print("Remova as notas menores que 7 e exiba a lista: ");
         Iterator<Double> iterator1 = notas.iterator();
         while (iterator1.hasNext()){
             Double next = iterator1.next();
             if(next < 7) iterator1.remove();
         }
         System.out.println(notas);

         System.out.print("Exiba todas as notas na ordem que foram informadas: ");
         Set<Double> notas2 = new LinkedHashSet<>();
         notas2.add(7d);
         notas2.add(8.5);
         notas2.add(9.3);
         notas2.add(5d);
         notas2.add(7d);
         notas2.add(0d);
         notas2.add(3.6);
         System.out.println(notas2);

         System.out.print("Exiba todas as notas na ordem crescente: ");
         Set<Double> notas3 = new TreeSet<>(notas2);
         System.out.println(notas3);
         
     }
}
