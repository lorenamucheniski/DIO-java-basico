package Set.Exercicios;

import java.util.*;

public class ExArcoIris {
    public static void main(String[] args){

        System.out.println("--\tExiba as cores do arco-íris\t--");
        Set<Cores> cores1 = new LinkedHashSet<>(){{
            add(new Cores("Vermelho"));
            add(new Cores("Laranja"));
            add(new Cores("Amarelo"));
            add(new Cores("Verde"));
            add(new Cores("Azul"));
            add(new Cores("Anil"));
            add(new Cores("Violeta"));
        }};
        for(Cores cores: cores1) System.out.println(cores.getNomeCor());

        System.out.println("--\tExiba a quantidade de cores do arco-íris\t--");
        System.out.println(cores1.size() + " cores.");

        System.out.println("--\tExiba as cores em ordem alfabética\t--");
        Set<Cores> cores2 = new TreeSet<>(new ComparatorNome());
        cores2.addAll(cores1);

        for(Cores cores: cores2) System.out.println(cores.getNomeCor());

        System.out.println("--\tExiba as cores na ordem inversa da que foi informada\t--");
        Set<String> cores3 = new LinkedHashSet<>(
                Arrays.asList("Vermelho", "Laranja", "Amarelo", "Verde", "Azul", "Anil", "Violeta"));
        List<String> coresList = new ArrayList<>(cores3);
        Collections.reverse(coresList);
        System.out.println(coresList);

        System.out.println("--\tExiba todas as cores que começam com a letra V\t--");
        for(String cores: cores3) {
            if (cores.startsWith("V")) System.out.println(cores);
        }

        System.out.println("--\tRemova todas as cores que não começam com a letra V\t--");
        Iterator<String> iterator2 = cores3.iterator();
        while ((iterator2.hasNext())){
            if(!iterator2.next().startsWith("V")) iterator2.remove();
        }
        System.out.println(cores3);

        System.out.println("--\tLimpe o conjunto\t--");
        cores1.clear();
        System.out.println(cores1);

        System.out.println("Confira se o conjunto esta vazio: " + cores1.isEmpty());

    }

}
