package aulas.aula76.program;

import aulas.aula76.entities.Product;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter product data:");
        System.out.print("Name: ");

        String name = sc.next();
        System.out.print("Price: ");
        double price = sc.nextDouble();

        System.out.print("Quantity: ");
        int quatity = sc.nextInt();

        Product pro = new Product(name, price, quatity);


        System.out.print("Product data: " + pro);

        System.out.printf("%nEnter the number of products to be added in stock: ");
        pro.addProducts(sc.nextInt());

        System.out.print("Updated data: " + pro);

        System.out.printf("%nEnter the number of products to be removed in stock: ");
        pro.removeProducts(sc.nextInt());

        System.out.print("Updated data: " + pro);
    }
}
