package listas.part1;

/* 1- Faça um programa que leia a temperatura média dos 6 primeiros meses do ano e
armazene-as em uma lista;
2 - Calcule a média semestral das temperaturas e mostre todas as temperaturas acima dessa média, e em que mês elas
ocorreram, por extenso;
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ExerciciosList1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Double> temperaturas = new ArrayList<Double>();

        //adicionando as temperaturas na lista
        int i = 0;
        while (true){
            if (i == 6) break;

            System.out.println("Digite a temperatura: ");
            double temp = scan.nextDouble();
            temperaturas.add(temp);
            i++;
        }
        System.out.println("--------------------------");

        //exibindo todas as temperaturas;
        System.out.println("Todas as temperaturas");
        temperaturas.forEach(t -> System.out.print(t + " "));

        System.out.println("--------------------------");

        //calculando e exibindo a media das temperaturas;
        Double media = temperaturas.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0d);
        System.out.printf("\nMédia das temperaturas: %.1f\n", media);

        //exibindo as temperaturas acima da média
        System.out.println("Temperaturas acima da média: ");
        temperaturas.stream()
                .filter(t -> t > media)
                .forEach(t -> System.out.printf("%.1f", t));

        //exibindo os meses das temperaturas acima da média
        System.out.println("\nMeses das temperaturas acima da média: ");
        Iterator<Double> iterator = temperaturas.iterator();

        int count = 0;
        while (iterator.hasNext()){
            Double temp = iterator.next();
            if (temp > media){
                switch (count){
                    case(0):
                        System.out.printf("Janeiro: %.1f", temp);
                    case(1):
                        System.out.printf("Fevereiro: %.1f", temp);
                    case(2):
                        System.out.printf("Março: %.1f", temp);
                    case(3):
                        System.out.printf("Abril: %.1f", temp);
                    case(4):
                        System.out.printf("Maio: %.1f", temp);
                    case(5):
                        System.out.printf("Junho: %.1f", temp);
                }
            }
        }

    }
}