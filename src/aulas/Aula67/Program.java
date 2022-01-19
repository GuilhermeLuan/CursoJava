package aulas.Aula67;

import aula67.entities.Products;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Products products = new Products();

        System.out.println("Enter products data: ");
        System.out.print("Name: ");
        products.name = sc.next();

        System.out.print("Price: ");
        products.price = sc.nextDouble();

        System.out.print("Quantity in stock: ");
        products.quantity = sc.nextInt();

        System.out.println("Product data: " + products);


        System.out.print("Enter the number of products to be added in stock:");
        products.addProducts(sc.nextInt());
        System.out.println("Updated data: " + products);

        System.out.print("Enter the number of products to be removed from stock:");
        products.removeProducts(sc.nextInt());
        System.out.println("Product data: " + products);
    }
}
