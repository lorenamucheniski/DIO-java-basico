package Set.Exercicios;

import java.util.*;

class ConjuntoLinguagem{
    public static void main(String[] args){
        Set<LinguagemFavorita> linguagemFavorita = new HashSet<>(){{
           add(new LinguagemFavorita("java", 1991, "IntelliJ"));
           add(new LinguagemFavorita("python", 1989, "PyCharm"));
           add(new LinguagemFavorita("C++", 1983, "neovim"));
        }};

        System.out.println("--\tOrdem de inserção\t--");
        Set<LinguagemFavorita> linguagemFavorita1 = new LinkedHashSet<>(){{
            add(new LinguagemFavorita("java", 1991, "IntelliJ"));
            add(new LinguagemFavorita("python", 1989, "PyCharm"));
            add(new LinguagemFavorita("C++", 1983, "neovim"));
        }};
        for (LinguagemFavorita linguagem: linguagemFavorita1) System.out.println(linguagem.getNome() + " - " +
                linguagem.getAnoDeCriacao() + " - " + linguagem.getIde());

        System.out.println("--\tOrdem natural(Nome)\t--");
        Set<LinguagemFavorita> linguagemFavorita2 = new TreeSet<>(new ComparatorNomeUm());
        linguagemFavorita2.addAll(linguagemFavorita);
        for (LinguagemFavorita linguagem: linguagemFavorita2) System.out.println(linguagem.getNome() + " - " +
                linguagem.getAnoDeCriacao() + " - " + linguagem.getIde());

        System.out.println("--\tOrdenção por IDE\t--");
        Set<LinguagemFavorita> linguagemFavorita3 = new TreeSet<>(new ComparatorIde());
        linguagemFavorita3.addAll(linguagemFavorita);
        for (LinguagemFavorita linguagem: linguagemFavorita3) System.out.println(linguagem.getNome() + " - " +
                linguagem.getAnoDeCriacao() + " - " + linguagem.getIde());

        System.out.println("--\tOrdenção por ano de crianção e nome\t--");
        Set<LinguagemFavorita> linguagemFavorita4 = new TreeSet<>(new ComparatorAno());
        linguagemFavorita4.addAll(linguagemFavorita);
        for (LinguagemFavorita linguagem: linguagemFavorita4) System.out.println(linguagem.getNome() + " - " +
                linguagem.getAnoDeCriacao() + " - " + linguagem.getIde());

        }

    }

class LinguagemFavorita {
    private String nome;
    private Integer anoDeCriacao;
    private String Ide;

    public LinguagemFavorita(String nome, Integer anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        Ide = ide;
    }
    public String getNome() {
        return nome;
    }

    public Integer getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public String getIde() {
        return Ide;
    }
    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", anoDeCriacao=" + anoDeCriacao +
                ", Ide='" + Ide + '\'' +
                '}';
    }
}

class ComparatorNomeUm implements Comparator<LinguagemFavorita> {
    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int nome = l1.getNome().compareTo(l2.getNome());
        return nome;
    }
}

class ComparatorIde implements Comparator<LinguagemFavorita>{
    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int ide = l1.getIde().compareTo(l2.getIde());
        return ide;
    }
}

class ComparatorAno implements Comparator<LinguagemFavorita>{
    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int ano = l1.getAnoDeCriacao().compareTo(l2.getAnoDeCriacao());
        if (ano != 0) {
            return ano;
        }
        return ano;
    }
}
