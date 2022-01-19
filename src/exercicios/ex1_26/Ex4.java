package exercicios.ex1_26;

import java.util.Locale;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        double raio, area;

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o raio de um circulo: ");
        raio = sc.nextDouble();

        area =  3.14159 * Math.pow(raio, 2);

        System.out.printf("A area do circulo: %.4f", area);
    }
}
