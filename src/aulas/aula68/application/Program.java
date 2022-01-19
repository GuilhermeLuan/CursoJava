package aulas.aula68.application;

import aulas.aula68.util.Calculator;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Calculator cal = new Calculator(); //instanciação de um objeto

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        System.out.printf("Circumference: %.2f%n", Calculator.circumference(radius));
        System.out.printf("Volume: %.2f%n", Calculator.volume(radius));
        System.out.printf("PI: %.2f%n", Calculator.pi());
    }

}
