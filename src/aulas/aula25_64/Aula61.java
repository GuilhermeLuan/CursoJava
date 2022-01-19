package aulas.aula25_64;

import java.util.Scanner;

public class Aula61 {
    //Bloco de uma classe

    public static void main(String[] args) {
        //Programa principal
        //Função main -> executada em primeiro lugar
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int higher = max(a, b, c);

        showResult(higher);
    }

    public static int max(int x, int y, int z) { //Recebe 3 valores e calcula o maior deles
        //As variaveis x,y,z,aux so existem na execução desta função
        //Public -> função disponivel em outras classes
        //Static -> função pode ser chamda intependende de se criar um objeto
        int aux;
        if (x > y && x > z) {
            aux = x;
        } else aux = Math.max(y, z);
        return aux;
    }

    public static void showResult(int value) { //Recebe um valor e imprime na tela
        //Void -> faz uma ação se retonar um valor
        System.out.println("Higher = " + value);
    }
}
