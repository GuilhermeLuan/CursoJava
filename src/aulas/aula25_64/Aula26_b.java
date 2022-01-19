package aulas.aula25_64;

import java.util.Scanner;

public class Aula26_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Declaração do scanner

        int x;
        String s1,s2,s3;

        x = sc.nextInt();
        //Ler um texto até a quebra de linha
        sc.nextLine(); //Resolução do problema
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("Dados digitados: ");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();

    }
}
