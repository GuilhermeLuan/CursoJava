package aulas.aula25_64;

import java.util.Locale;
import java.util.Scanner;

public class Aula26 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in); //Asociação do objeto scanner ao teclado no modo telcado

        //Entrada de dados para um String
        String x;
        System.out.print("Digite alguma palavra: ");
        x = sc.next(); //Leitura de uma string
        System.out.println("Você digitou: " + x);

        //Entrada de dados para int
        int y;
        System.out.print("Digite um numero inteiro: ");
        y = sc.nextInt(); //Leitura de um numero inteiro
        System.out.println("Voce digiou o num: " + y);

        //Entrada de dados para Double
        double z;
        System.out.print("Digite um numero quebrado: ");
        z = sc.nextDouble(); // Leitura de um tipo double
        System.out.printf("Voce digitou o num: %.2f%n", z);

        //Entrada de dados para Char
        char w;
        System.out.print("Digite apenas um caracter: ");
        w = sc.next().charAt(0);
        System.out.println("Voce digitou: "+ w);

        //Leitura de varios dados na mesma linha separados pro espaço
        String a;
        int b;
        double c;
        System.out.print("Digite alguma palavra: ");
        a = sc.next();
        System.out.print("Digite um numero inteiro: ");
        b = sc.nextInt();
        System.out.print("Digite um numero quebrado: ");
        c = sc.nextDouble();
        System.out.printf("Dados digitados: %s %d %.2f", a, b, c);


        sc.close();
        //Encerra o recurso Scanner
    }
}
