package exercicios.ex41;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Person> list = new ArrayList<Person>();

        System.out.print("Enter the numbers of tax payers: ");
        int taxPayers = sc.nextInt();

        for (int i = 1; i<=taxPayers; i++){
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char taxType = sc.next().charAt(0);

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();

            if (taxType == 'i'){
                System.out.print("Health expensive: ");
                double health = sc.nextDouble();
                list.add(new NaturalPerson(name, anualIncome, health));
            }
            else{
                System.out.print("Number of employees: ");
                int employees = sc.nextInt();
                list.add(new LegalPerson(name, anualIncome, employees));
            }

        }
        System.out.println("TEXES PAID: ");
        double sum = 0;
        for(Person p : list){
            System.out.println(p.getName() + ": $ " + String.format("%.2f", p.tax()));
            sum += p.tax();
        }
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
    }
}
