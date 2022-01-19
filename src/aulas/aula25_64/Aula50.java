package aulas.aula25_64;

import java.util.Scanner;

public class Aula50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int soma = 0;

        for (int I = 0; I < N; I++){
            int x = sc.nextInt();
            soma += x;
        }
        System.out.println(soma);
    }
}
