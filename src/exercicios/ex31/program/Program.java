package exercicios.ex31.program;

import exercicios.ex31.entities.Account;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();


        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();

        System.out.print("Is there an initial deposit (y/n)?  ");

        char askDeposit = sc.next().charAt(0);

        if (askDeposit == 'y'){
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(number, holder, initialDeposit);
        }
        else {
            account = new Account(number, holder);
        }


        System.out.println("Account data: \n" + account);

        System.out.print("Enter a deposit value: ");
        account.depositValue(sc.nextInt());
        System.out.println("Updated account data: \n" + account);

        System.out.print("Enter a withdraw value: ");
        account.withdrawValue(sc.nextDouble());
        System.out.println("Updated account data: \n" + account);

        sc.close();
    }
}
