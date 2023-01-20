package Set.Exercicios;

import java.util.Comparator;

class Cores {
    private String nomeCor;

    public Cores(String nomeCor) {
        this.nomeCor = nomeCor;
    }

    public String getNomeCor() {
        return nomeCor;
    }
}

class ComparatorNome implements Comparator<Cores> {
    @Override
    public int compare(Cores c1, Cores c2){
        int nome = c1.getNomeCor().compareTo(c2.getNomeCor());
        if (nome != 0) {
            return nome;
        }
        return nome;
    }
}
