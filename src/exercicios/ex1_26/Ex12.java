package exercicios.ex1_26;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        int horaInicial, horaFinal, duracao;
        Scanner sc = new Scanner(System.in);

        horaInicial = sc.nextInt();
        horaFinal = sc.nextInt();

        if (horaInicial < horaFinal)
            duracao = horaFinal - horaInicial;
        else
            duracao = 24 - horaInicial + horaFinal;

        System.out.printf("O jogo durou %d hora(s)", duracao);

    }
}
