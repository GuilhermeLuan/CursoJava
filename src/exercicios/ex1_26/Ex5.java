package exercicios.ex1_26;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d, diff;


        System.out.print("num1: ");
        a = sc.nextInt();

        System.out.print("num2: ");
        b = sc.nextInt();

        System.out.print("num2: ");
        c = sc.nextInt();

        System.out.print("num3: ");
        d = sc.nextInt();

        diff = (a * b - c * d);

        System.out.println("Diferenca: " + diff);

        sc.close();
    }
}
