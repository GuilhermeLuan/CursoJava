package exercicios.ex1_26;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        int num1, num2, soma;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        num1 = sc.nextInt();

        System.out.print("Digite outro numero: ");
        num2 = sc.nextInt();

        soma = num1 + num2;

        System.out.println("A soma " + soma);

        sc.close();
    }
}
