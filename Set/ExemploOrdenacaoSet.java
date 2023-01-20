package Set;

/* Dadas as seguintes informações sobre minhas séries favoritas, crie um conjunto e ordene este conjunto, exibindo:
(nome - genero - tempo de episodio);

série 1 - nome = got, genero = fantasia, tempoEpisodio = 60;
série 2 - nome = dark, genero = drama, tempoEpisodio = 60;
série 3 - nome = vikings, genero = aventura, tempoEpisodio = 50;
 */

import java.util.*;

public class ExemploOrdenacaoSet {
    public static void main(String[] args){

        System.out.println("--\tOrdem aleatória\t--");
        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "aventura", 60));
            add(new Serie("vikings", "aventura", 50));
        }};
        for (Serie serie: minhasSeries) System.out.println(serie.getNome() + "-" +
                    serie.getGenero() + "-" + serie.getTempoEpisodio());

        System.out.println("--\tOrdem de inserção\t--");
        Set<Serie> minhasSeries1 = new LinkedHashSet<>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "aventura", 60));
            add(new Serie("vikings", "aventura", 50));
        }};
        for (Serie serie: minhasSeries1) System.out.println(serie.getNome() + "-" +
                serie.getGenero() + "-" + serie.getTempoEpisodio());

        System.out.println("--\tOrdem natural (tempo de episódio)\t--");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
        for(Serie serie: minhasSeries2) System.out.println(serie.getNome() + " - " +
                serie.getGenero() + " - " + serie.getTempoEpisodio());

        System.out.println("--\tOrdem Nome/Gênero/TempoEpisódio\t--");
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
        minhasSeries3.addAll(minhasSeries1);

        for(Serie serie: minhasSeries3) System.out.println(serie.getNome() + " - " +
                serie.getGenero() + " - " + serie.getTempoEpisodio());
    }

}