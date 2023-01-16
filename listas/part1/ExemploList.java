package listas.part1;

import java.util.ArrayList;
import java.util.List;

class ExemploList {

    public static void main(String[] args) {

        System.out.println("Crie uma lista e adicione 7 notas: ");

        List<Double> notas = new ArrayList<Double>();
        notas.add(7d);
        notas.add(8.2);
        notas.add(8.6);
        notas.add(7.1);
        notas.add(6.8);
        notas.add(8d);
        notas.add(8.9);

        System.out.println(notas);

        System.out.println("Exiba a posição da nota 7.1 : " + notas.indexOf(7.1));

        System.out.println("Adicione na lista a nota 9.0 na posição 4: ");
        notas.add(4, 9d);
        System.out.println(notas);

        System.out.println("Substitua a nota 6.8 por 6.0 :");
        notas.set(notas.indexOf(6.8), 6d);
        System.out.println(notas);

        System.out.println("Confira se a nota 7 está na lista: " + notas.contains(7d));

        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        for (Double nota : notas) System.out.println(nota);

    }
}
