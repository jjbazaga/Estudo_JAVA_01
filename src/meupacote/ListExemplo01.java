package meupacote;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListExemplo01 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("José");
        list.add("Maria");
        list.add("Antonia");
        list.add("Oliveira");
        list.add("Marta");
        list.add("Lucia");
        list.add("Renata");
        list.add(2,"André");
        list.add("Angela");

        System.out.println("Tamanho da lista: " + list.size());
        for (String obj : list) {
            System.out.println(obj);
        }

        System.out.println("-------------------------------------------------");
        list.remove("Antonia");
        list.remove(0);
        list.removeIf(y -> y.charAt(0) == 'M');   //Predicado, função lambda

        System.out.println("Tamanho da lista: " + list.size());
        for (String obj : list) {
            System.out.println(obj);
        }

        System.out.println("-------------------------------------------------");
        System.out.println("Index of Renata: " + list.indexOf("Renata"));
        System.out.println("Exemplo de não encontrado: " + list.indexOf("José")); //Retorna -1

        System.out.println("-------------------------------------------------");
        List<String> filtro = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        System.out.println("Tamanho da lista: " + list.size());
        for (String obj : filtro) {
            System.out.println(obj);
        }

        System.out.println("-------------------------------------------------");
        String nome1 = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(nome1);

        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");
        String nome2 = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(nome2);

    }
}
