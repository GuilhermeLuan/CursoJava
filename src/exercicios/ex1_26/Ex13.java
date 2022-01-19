package exercicios.ex1_26;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        int code, quantidade;
        double total = 0;
        Scanner sc = new Scanner(System.in);
        
        code = sc.nextInt();
        quantidade = sc.nextInt();
        
        if (code == 1) {
            total = 4.00 * quantidade;
        }
        else{
            if (code == 2) {
                total = 4.50 * quantidade;
            }
            if (code == 3) {
                total = 5 * quantidade;
            }
            if (code == 4) {
                total = 2 * quantidade;
            }
            if (code == 5) {
                total = 1.5 * quantidade;
            }
        }
        System.out.printf("Total: R$ %.2f%n", total);


    }
}
