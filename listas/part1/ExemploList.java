package listas.part1;

import java.util.*;

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

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Insira a soma dos valores: " + soma);

        System.out.println("Exiba a média das notas: " + (soma/notas.size()));

        System.out.println("Remova a nota 8 :");
        notas.remove(8d);
        System.out.println(notas);

        System.out.println("Remova a nota da posição 0: ");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Apague toda a lista. ");
        notas.clear();

        System.out.println("Confira se a lista esta vazia: " + notas.isEmpty());

    }
}
