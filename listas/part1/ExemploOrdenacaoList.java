package listas.part1;

/*Dadas as seguintes informações sobre cachorros, crie uma lista e a ordene exibindo:
(nome - idade (em meses) - cor);

Cachorro 1 = Jon, idade: 18, cor: preto
Cachorro 2 = Simba, idade: 6, cor: marrom
Cachorro 3 = Jon, idade: 12, cor: amarelo
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploOrdenacaoList {
    public static void main (String[] args){

        List<Cachorro> cachorros = new ArrayList<>(){{
            add(new Cachorro("Jon", 18, "preto"));
            add(new Cachorro("Simba", 6,"marrom"));
            add(new Cachorro("Jon", 12,"amarelo"));

        }};
        System.out.println("---\tOrdem de Inserção\t---");
        System.out.println(cachorros);

        System.out.println("---\tOrdem aleatória\t---");
        Collections.shuffle(cachorros);
        System.out.println(cachorros);

        System.out.println("---\tOrdem por nome\t---");
        Collections.sort(cachorros);
        System.out.println(cachorros);

        System.out.println("---\tOrdem por idade\t---");
        cachorros.sort(new ComparatorIdade());
        System.out.println(cachorros);

        System.out.println("---\tOrdem por cor\t---");
        cachorros.sort(new ComparatorCor());
        System.out.println(cachorros);

        System.out.println("---\tOrdem por nome/cor/idade\t---");
        cachorros.sort(new ComparatorNomeCorIdade());
        System.out.println(cachorros);

    }
}

//classe com os atributos
class Cachorro implements Comparable<Cachorro>{
    private String nome;
    private Integer idade;
    private String cor;

    //Construtor
    public Cachorro(String nome, Integer idade, String cor ){
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;

    }
    //Get para retornar um valor;
    public String getNome(){
        return nome;
    }
    public Integer getIdade(){
        return idade;
    }

    public String getCor(){
        return cor;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }
    //comparaçao dos nomes
    @Override
    public int compareTo(Cachorro cachorro) {
        return this.getNome().compareToIgnoreCase(cachorro.getNome());
    }
}

class ComparatorIdade implements Comparator<Cachorro>{

    @Override
    public int compare(Cachorro o1, Cachorro o2) {
        return Integer.compare(o1.getIdade(), o2.getIdade());
    }
}

class ComparatorCor implements Comparator<Cachorro>{

    @Override
    public int compare(Cachorro o1, Cachorro o2) {
        return o1.getCor().compareToIgnoreCase(o2.getCor());
    }
}

class ComparatorNomeCorIdade implements Comparator<Cachorro>{

    @Override
    public int compare(Cachorro o1, Cachorro o2) {
        int nome = o1.getNome().compareToIgnoreCase(o2.getNome());
        if (nome != 0) return nome;

        int cor = o1.getCor().compareToIgnoreCase(o2.getCor());
        if (cor !=0) return cor;

         return Integer.compare(o1.getIdade(), o2.getIdade());
    }
}