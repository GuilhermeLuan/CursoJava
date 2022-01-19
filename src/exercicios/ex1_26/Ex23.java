package exercicios.ex1_26;

import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        int numRepeticoes, i;
        double X, Y;

        Scanner sc = new Scanner(System.in);

        numRepeticoes = sc.nextInt();

        for (i=0; numRepeticoes>i; i++){
            X = sc.nextInt();
            Y = sc.nextInt();

            if (Y == 0)
                System.out.println("divisão impossivel");
            else
                System.out.printf("%.1f%n", X / Y);
        }
    }
}
