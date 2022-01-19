package exercicios.ex1_26;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        int num;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um num: ");
        num = sc.nextInt();

        if ((num % 2) == 0)
            System.out.println("Par");
        else
            System.out.println("Impar");

    }
}
