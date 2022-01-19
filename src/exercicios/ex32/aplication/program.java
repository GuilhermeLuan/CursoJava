package exercicios.ex32.aplication;

import exercicios.ex32.utils.Rent;

import java.util.Scanner;

public class program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Rent[] vector = new Rent[10];

        System.out.print("How many rooms will be rented? ");
        int rooms = sc.nextInt();

        for (int i = 1; i<=rooms; i++){
            System.out.println("Rent #" + i);
            System.out.print("Name: ");

            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Room: ");
            int room = sc.nextInt();

            vector[room] = new Rent(name, email, room);
        }

        sc.close();

        System.out.println("Busy rooms: ");
        for (Rent rent : vector) {
            if (rent != null) {
                System.out.println(rent);
            }
        }
    }
}
