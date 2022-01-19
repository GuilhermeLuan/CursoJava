package aulas.aula79.program;

import aulas.aula79.entities.Product;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter product data:");
        System.out.print("Name: ");

        String name = sc.next();
        System.out.print("Price: ");
        double price = sc.nextDouble();


        Product pro = new Product(name, price);

        pro.setName("Computer");
        System.out.println("Updated name: " + pro.getName());
        pro.setPrice(1200);
        System.out.println("Updated price: " + pro.getPrice());


        System.out.print("Product data: " + pro);

        System.out.printf("%nEnter the number of products to be added in stock: ");
        pro.addProducts(sc.nextInt());

        System.out.print("Updated data: " + pro);

        System.out.printf("%nEnter the number of products to be removed in stock: ");
        pro.removeProducts(sc.nextInt());

        System.out.print("Updated data: " + pro);
    }
}
