package aulas.aula89;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Product[] vector = new Product[n];

        for(int i = 0; i<vector.length; i++){
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vector[i] = new Product(name, price);
        }
        double sum = 0;

        for (Product product : vector) {
            sum += product.getPrice();
        }

        double avg = sum /vector.length;

        System.out.printf("Average price = %.2f", avg);
    }
}
