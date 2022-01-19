package exercicios.ex1_26;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i=0; i<num; i++){
            if (i % 2 != 0)
                System.out.println(i);

        }
    }
}
