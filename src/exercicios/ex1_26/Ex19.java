package exercicios.ex1_26;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pedido, alcoo = 0, gasolina = 0, diesel = 0;

        pedido = sc.nextInt();

        while (pedido != 4){
            pedido = sc.nextInt();

            if (pedido == 1){
                alcoo += 1;
            }

            else if (pedido == 2){
                gasolina += 1;
            }

            else if (pedido == 3){
                diesel += 1;
            }
        }

        System.out.println("MUITO OBRIGADO");
        System.out.printf("Alcoo: %d%nGasolina: %d%nDiesel: %d%n", alcoo, gasolina, diesel);
    }
}
