package exercicios.ex36.application;

import exercicios.ex36.enities.enums.WorkerLevel;
import exercicios.ex36.entities.Department;
import exercicios.ex36.entities.HourContract;
import exercicios.ex36.entities.Worker;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter department's name: ");
        String departmentName = sc.nextLine();
        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Level: ");
        String level = sc.nextLine();
        System.out.print("Base Salary: ");
        double salary = sc.nextDouble();

        Worker worker = new Worker(name, WorkerLevel.valueOf(level), salary, new Department(departmentName));

        System.out.print("How many contracts to this worker? ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            System.out.println("Enter contract #" + i + " data: ");
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration: ");
            int durationHour = sc.nextInt();
            HourContract contract = new HourContract(contractDate, valuePerHour, durationHour);
            worker.addContract(contract);
        }

        System.out.println("Enter month and year to calculate income (MM/YYY)");
        String monthAndYear = sc.next();
        int mouth = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println(mouth);
        System.out.println(year);
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, mouth)));
    }
}
