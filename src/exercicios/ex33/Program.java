package exercicios.ex33;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employees> list = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int repeat = sc.nextInt();

        for(int i = 1; i<=repeat;i++){
            System.out.println("Employee #" + i);
            System.out.print("Id:");
            int id = sc.nextInt();
            while(hasId(list, id)){
                System.out.print("Id already taken. Try again: ");
                id = sc.nextInt();
            }
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Salary:");
            double salary = sc.nextDouble();

            list.add(new Employees(id, name, salary));
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int idToSalaryIncrease = sc.nextInt();
        Employees emp = list.stream().filter(x -> x.getId() == idToSalaryIncrease).findFirst().orElse(null);

        if (emp == null){
            System.out.println("This id does not exits!");
        }
        else{
            System.out.print("Enter the percentage: ");
            int percentage = sc.nextInt();
            emp.increaseSalary(percentage);
        }

        for(Employees obj : list){
            System.out.println(obj);
        }



    }

    private static boolean hasId(List<Employees> list, int id) {

        Employees emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
