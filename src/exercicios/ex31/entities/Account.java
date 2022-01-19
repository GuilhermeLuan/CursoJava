package exercicios.ex31.entities;

public class Account {
    private final int number;
    private String name;
    private double balance;


    public Account(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public Account(int number, String name, double initialBalance) {
        this.number = number;
        this.name = name;
        depositValue(initialBalance);
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void depositValue(double value){
        balance += value;
    }
    public void withdrawValue(double value){
        balance = balance - 5 - value;
    }

    public String toString(){
        return "Account " +
                number +
                ", " +
                "Holder: "+
                name +
                ", " +
                "Balance: $ " +
                String.format("%.2f", balance);
    }
}
