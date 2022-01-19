package exercicios.ex1_26;

import java.util.Locale;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

//        double largura;
//        double comprimento;
//        double valorMetro;

        //Chama o metodo Scanner
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a largura de um terreno: ");
        double largura = sc.nextDouble();

        System.out.print("Digite o compimento de um terreno: ");
        double comprimento = sc.nextDouble();

        System.out.print("Digite o valor do metro quadrado: ");
        double metroQuadrado = sc.nextDouble();

        double area = largura * comprimento; //Calculo da area
        double preco = area * metroQuadrado; //Calculo do valor pro metro quadrado

        System.out.printf("A area do terreno e %.2f e o seu preco por metro quadrado e %.2f", area, preco);

        sc.close();
    }
}
