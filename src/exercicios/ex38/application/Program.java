package exercicios.ex38.application;

import exercicios.ex38.enities.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter a cliente data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());

        Client client = new Client(name, email, birthDate);

        System.out.print("Enter Order data: ");
        System.out.print("Status: ");
        String orderStatus = sc.next();

        Order order = new Order(new Date(), OrderStatus.valueOf(orderStatus), client);

        System.out.print("How many items to this order? ");
        int itemsOrder = sc.nextInt();

        for(int i=1; i<=itemsOrder; i++){
            System.out.println("Enter #" + i + "item data");
            System.out.print("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();

            Product product = new Product(productName, productPrice);

            System.out.print("Quantity: ");
            int productQuantity = sc.nextInt();

            OrderItem orderItem = new OrderItem(productQuantity, productPrice, product);
            order.addItem(orderItem);
        }
        System.out.println("ORDER SUMMARY:");
        System.out.println(order);
    }
}
