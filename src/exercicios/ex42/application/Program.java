package exercicios.ex42.application;

import exercicios.ex42.model.entities.Account;
import exercicios.ex42.model.exception.DomainException;

import java.security.DigestException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data");
        System.out.print("Number: ");
        int numberAccount = sc.nextInt();

        System.out.print("Holder: ");
        sc.nextLine();
        String holderAccount = sc.nextLine();

        System.out.print("Initial balance: ");
        double initialBalance = sc.nextDouble();

        System.out.print("Withdraw limit: ");
        double withdrawLimit = sc.nextDouble();

        Account account = new Account(numberAccount, holderAccount, initialBalance, withdrawLimit);

        System.out.print("\nEnter amount for withdraw: ");
        double withdraw = sc.nextDouble();

        sc.close();

        try{
            account.withdraw(withdraw);
            System.out.println("New balance:" + account.getBalance());
        }
        catch (DomainException e){
            System.out.println("Withdraw error: " + e.getMessage());
        }

    }
}
