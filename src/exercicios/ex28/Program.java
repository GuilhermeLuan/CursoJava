package exercicios.ex28;

import exercicios.ex28.entities.Employee;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Employee emp = new Employee();
        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        emp.name = sc.nextLine();

        System.out.print("Gross salary: ");
        emp.grossSalary = sc.nextDouble();

        System.out.print("Tax: ");
        emp.tax = sc.nextDouble();

        System.out.println("Employee: " + emp);

        System.out.println("Which percentage to increase salary? ");
        emp.increseSalary(sc.nextDouble());

        System.out.println("Update data: " + emp);
    }
}
