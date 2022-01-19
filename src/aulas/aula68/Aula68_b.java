package aulas.aula68;

import java.util.Scanner;

public class Aula68_b {
    public static double PI = Math.PI;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter raidius: ");
        double radius = sc.nextDouble();
        System.out.printf("cimcumferece: %.2f%n", circumference(radius));
        System.out.printf("volume: %.2f%n", volume(radius));
        System.out.printf("PI: %.2f%n", PI);
    }

    public static double circumference(double radius){
        return 2* PI * radius;
    }
    public static double volume(double radius){
        return (4 * PI * Math.pow(radius, 3)) / 3;
    }
}
