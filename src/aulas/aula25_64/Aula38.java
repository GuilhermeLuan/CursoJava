package aulas.aula25_64;

import java.util.Locale;
import java.util.Scanner;

public class Aula38 {
    public static void main(String[] args) {
        int minutes;
        double valor = 50;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        minutes = sc.nextInt();

        if (minutes > 100)
            valor += (minutes - 100) * 2;

        System.out.printf("Valor a pagar: R$ %.2f", valor);
    }
}
