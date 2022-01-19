package aulas.aula94;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marco");

        System.out.println(list.size()); //Tamanho da lista

        for(String x : list){
            System.out.println(x);
        }
        System.out.println("--------------------------------------");

        list.removeIf(x -> x.charAt(0) == 'M'); //Remover que o nome que começa com m

        for(String x : list){
            System.out.println(x);
        }

        System.out.println("--------------------------------------");
        System.out.println("Index of Bob:" + list.indexOf("Bob"));
        System.out.println("Index of Bob:" + list.indexOf("Marco"));
        System.out.println("--------------------------------------");
        /*
        .stream -> converter a lista para string
        .filter -> operação lambda, onde filtras os nomes com letra "a"
        .collect(Collectors.toList()) -> volta para lista
         */
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        for(String x : result){
            System.out.println(x);
        }
        System.out.println("--------------------------------------");
        /*
        .findFirst() -> Pega o primeiro elemento dessa String, porem returna um Optional<String>
        .orElse() -> Caso o elementos 'a' não exista ele vai retorna nulo.
         */
        String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(name);
    }
}
