package exercicios.ex1_26;

import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1; i<=n; i++){

            System.out.print(i);
            System.out.printf(" %.0f",Math.pow(i, 2));
            System.out.printf(" %.0f%n",Math.pow(i, 3));

        }

    }
}
