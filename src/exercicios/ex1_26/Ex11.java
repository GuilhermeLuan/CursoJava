package exercicios.ex1_26;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);

        num1 = sc.nextInt();
        num2 = sc.nextInt();

        if ((num1 % num2) == 0 || (num2 % num1 == 0))
            System.out.println("Sao Multiplos");
        else
            System.out.println("Nao sao Multiplos");
    }
}
