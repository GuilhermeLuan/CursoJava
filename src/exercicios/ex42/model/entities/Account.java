package exercicios.ex42.model.entities;

import exercicios.ex42.model.exception.DomainException;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount){
        validateWithdraw(amount);
        balance -= amount;
    }
    public void validateWithdraw(double amount){
        if(amount > withdrawLimit){
            throw new DomainException("The amount exceeds withdraw limit");
        }
        if(amount > balance)
            throw new DomainException("Not enough balance");
    }

    @Override
    public String toString() {
        return "Account{" +
                "number=" + number +
                ", holder='" + holder + '\'' +
                ", balance=" + balance +
                ", withdrawLimit=" + withdrawLimit +
                '}';
    }
}
