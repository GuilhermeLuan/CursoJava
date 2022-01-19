package aulas.aula25_64;

import java.util.Locale;
import java.util.Scanner;

public class Aula55 {
    public static void main(String[] args) {

        double celsius, fahr;
        char rep;

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Digite a temperatura em Celsius: ");

            celsius = sc.nextDouble();
            fahr = 9 * celsius / 5 + 32; //Formula de celcius para fahreint

            System.out.printf("Equivalente em Fahrenheint: %.2f%n",fahr);

            System.out.print("Deseja repetir (s/n)? ");
            rep = sc.next().charAt(0);
            rep = Character.toLowerCase(rep);
        } while (rep == 's');

    }
}
