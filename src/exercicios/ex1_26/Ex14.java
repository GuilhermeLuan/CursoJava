package exercicios.ex1_26;

import java.util.Locale;
import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double valor;
        String msg = null;

        valor = sc.nextDouble();

        if (valor <= 25 && valor > 0)
            System.out.print("Intervalo [0,25]");
        if (valor <= 50 && valor > 25 )
            System.out.print("Intervalo (25,50]");
        if (valor <= 70 && valor > 50)
            System.out.print("Intervalo (50,75]");
        if (valor <= 100 && valor > 75)
            System.out.print("Intervalo (75,100]");
        if (valor > 100 || valor < 0)
            System.out.print("Fora de intervalo");
    }
}
