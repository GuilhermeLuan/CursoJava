package aulas.aula25_64;

import java.util.Scanner;

public class Aula58_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mask = 0b100000;
        int n = sc.nextInt();

        if ((n & mask) != 0){
            System.out.println("6th bit is true!");
        }
        else {
            System.out.println("6th bit is false!");
        }
    }
}
