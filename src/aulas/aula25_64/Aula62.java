package aulas.aula25_64;

import java.util.Scanner;

public class Aula62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, triangleX, triangleY;

        System.out.println("Enter the measures of triangle X");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        triangleX = areaTriangulo(a, b, c);

        System.out.println("Enter the measures of triangle Y");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        triangleY = areaTriangulo(a, b, c);

        showResult(triangleX,triangleY,max(triangleX,triangleY));
    }

    public static double areaTriangulo(double x, double y, double z){
        double p = (x + y + z )/ 2;
        return Math.sqrt(p*(p-x)*(p-y)*(p-z));
    }

    public static String max(double x, double y){
        if (x > y){
            return "X";
        }
        else {
            return "Y";
        }
    }

    public static void showResult(double x, double y, String z) {
        System.out.printf("Triangle X area: %.4f%n", x);
        System.out.printf("Triangle Y area: %.4f%n", y);
        System.out.println("Large area: " + z);
    }
}
