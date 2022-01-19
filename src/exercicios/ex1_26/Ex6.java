package exercicios.ex1_26;

import java.util.Locale;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        int code, hour;
        double salary, perHour;

        Scanner sc = new Scanner(System.in);
        System.out.print("Codigo do funcionario: ");
        code = sc.nextInt();

        System.out.print("Horas trabalhadas: ");
        hour = sc.nextInt();

        System.out.print("Valor por hora: ");
        perHour = sc.nextDouble();

        salary = hour * perHour;

        System.out.println("NUMBER = " + code);
        System.out.printf("SALARY = U$ %.2f", salary);

        sc.close();
    }
}
