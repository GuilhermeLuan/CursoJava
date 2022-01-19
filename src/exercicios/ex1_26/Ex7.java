package exercicios.ex1_26;

import java.util.Locale;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        int codeFist, numFirst, codeSecond, numSecond;
        double unitFirst, unitSecond, price;

        Scanner sc = new Scanner(System.in);

        codeFist = sc.nextInt();
        numFirst = sc.nextInt();
        unitFirst = sc.nextDouble();

        codeSecond = sc.nextInt();
        numSecond = sc.nextInt();
        unitSecond = sc.nextDouble();

        price =  (numFirst * unitFirst) + (numSecond * unitSecond);
        System.out.printf("VALOR A PAGAR: R$ %.2f ", price);

    }
}
