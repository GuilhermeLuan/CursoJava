package exercicios.ex1_26;

import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int fatorial = 1;
        
        for (int i = 1; i<=N; i++){
            fatorial *= i;
        }

        System.out.println(fatorial);
    }
}
