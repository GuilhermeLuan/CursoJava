package exercicios.ex1_26;

import java.util.Locale;
import java.util.Scanner;


public class Ex8 {
    public static void main(String[] args) {

        double A, B, C, areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        areaTriangulo = A * C / 2;
        areaCirculo = 3.14159 * Math.pow(C, 2);
        areaTrapezio = (A + B) * C /2;
        areaQuadrado = Math.pow(B, 2);
        areaRetangulo = A * B;

        System.out.printf("TRIANGULO: %.3f%n", areaTriangulo);
        System.out.printf("CIRCULO: %.3f%n", areaCirculo);
        System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
        System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
        System.out.printf("RETANGULO: %.3f%n", areaRetangulo);
    }
}
