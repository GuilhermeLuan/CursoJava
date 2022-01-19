package aulas.aula25_64;

import java.util.Scanner;

public class Aula39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;
        String dia;

        x = sc.nextInt();

        dia = switch (x) {
            case 1 -> "domingo";
            case 2 -> "segunda";
            case 3 -> "terca";
            case 4 -> "quarta";
            case 5 -> "quinta";
            case 6 -> "sexta";
            case 7 -> "sabado";
            default -> "valor invalido";
        };

        System.out.println("Dia da semana: " + dia);
    }
}
