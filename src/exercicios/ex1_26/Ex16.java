package exercicios.ex1_26;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        double salario, valor = 0;
        Scanner sc = new Scanner(System.in);

        salario = sc.nextDouble();

        if (salario <= 2000){
            valor = 0;
        }
        else if (salario <= 3000){
            valor = (salario - 2000.0) * 0.08;
        }
        else if (salario <= 4500){
            valor = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;;
        }
        else {
            valor = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
        }
        if (valor == 0.0){
            System.out.println("Isento");
        }
        else {
            System.out.printf("R$ %.2f%n", valor);
        }
    }
}
