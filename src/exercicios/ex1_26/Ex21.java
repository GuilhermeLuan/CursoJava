package exercicios.ex1_26;

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        int in = 0, out = 0, N, i, x;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();


        for (i=0; i<N; i++){

            x = sc.nextInt();

            if (x >= 10 && x <= 20)
                in += 1;

            else
                out += 1;

        }
        System.out.println(in + " in");
        System.out.println(out + " out");
    }
}
