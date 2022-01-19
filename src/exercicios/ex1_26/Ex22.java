package exercicios.ex1_26;

import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, i;
        double  valor1, valor2, valor3, mediaPonderada = 0;

        N = sc.nextInt();

        for (i=0; i<N; i++){

            valor1 = sc.nextDouble();
            valor2 = sc.nextDouble();
            valor3 = sc.nextDouble();

            mediaPonderada = (2 * valor1 + 3 * valor2 + 5 * valor3) / 10;

            System.out.printf("%.1f%n", mediaPonderada);
        }
    }
}
