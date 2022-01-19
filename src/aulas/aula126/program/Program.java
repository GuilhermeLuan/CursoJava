package aulas.aula126.program;

import aulas.aula126.entities.Account;
import aulas.aula126.entities.BusinessAccount;
import aulas.aula126.entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {

        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 400.00);

        //UPCASTING

        Account acc1 = bacc;
        //Tipo account
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 2000.00);
        Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);

        //Downcasting
        //ERRO -> Não posso converter de Account (SuperClasse) para BusinessAccount (SupClasse)
        //BusinessAccount acc4 = acc2;
        BusinessAccount acc4 = (BusinessAccount)acc2; //-> Casting formado
        acc4.loan(100.00);

        //BusinessAccount acc5 = (BusinessAccount) acc3; -> Parra corrigir o erro, temos que teste se o objeto acc3 é do tipo BusinessAccount.
        if (acc2 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount) acc2;
            System.out.println("Loan!");
        }
        if(acc2 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc2;
            acc5.uptadeBalance();
            System.out.println("Update!");
        }

    }
}
