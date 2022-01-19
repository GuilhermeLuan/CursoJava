package exercicios.ex39.program;

import exercicios.ex39.entities.Employee;
import exercicios.ex39.entities.OutSourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();

        System.out.print("Enter the numbers of employees: ");
        int numEmployees = sc.nextInt();

        for (int i = 1; i<= numEmployees; i++){
            System.out.println("Employee #" + i + " data:");

            System.out.print("Outsourced (y/n)?");
            char outSorced = sc.next().charAt(0);

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Hours: ");
            int hours = sc.nextInt();

            System.out.println("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            if (outSorced == 'y'){
                System.out.println("Additional charge:");
                double additionalCharge = sc.nextDouble();
                list.add(new OutSourcedEmployee(name, hours, valuePerHour, additionalCharge));
            }
            else{
                list.add(new Employee(name, hours, valuePerHour));
            }
        }
        System.out.println("PAYMENTS:");
        for(Employee emp : list){
            System.out.println(emp);
        }
    }
}
