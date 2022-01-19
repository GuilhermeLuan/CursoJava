package exercicios.ex1_26;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um num: ");
        num = sc.nextInt();

        if (num < 0)
            System.out.println("Negativo");
        else
            System.out.println("Não negativo");

    }
}
