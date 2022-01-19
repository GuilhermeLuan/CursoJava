package exercicios.ex40.Program;

import exercicios.ex40.entities.ImportedProduct;
import exercicios.ex40.entities.Product;
import exercicios.ex40.entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of products: ");

        int n = sc.nextInt();
        List<Product> list = new ArrayList<>();

        for (int i=1; i<=n; i++){
            System.out.println("Product #" + i + " data: ");
            System.out.print("Common, used or imported (c/u/i)? ");
            char productType = sc.next().charAt(0);

            System.out.print("Name: ");
            String name = sc.next();

            System.out.println("Price: ");
            double price = sc.nextDouble();

            if(productType == 'i'){
                System.out.print("Customs fee: ");
                double customsFree = sc.nextDouble();
                Product product = new ImportedProduct(name, price, customsFree);
                list.add(product);
            }
            else if(productType == 'c'){
                Product product = new Product(name, price);
                list.add(product);
            }
            else{
                System.out.print("Manufacture date (DD/MM/YYYY):");
                Date manufactureDate = sdf.parse(sc.next());
                Product product = new UsedProduct(name, price, manufactureDate);
                list.add(product);
            }
        }
        System.out.println("Price tags: ");
        for(Product product : list){
            System.out.println(product.priceTag());
        }
    }
}
