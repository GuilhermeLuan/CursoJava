package exercicios.ex30.util;

public class CurrencyConverter {

    public static double IOF = 0.06;

    public static double converter(double price, double amount){
        return price * amount * (1 + IOF);
//        double total = price * amount;
//        return (total * 0.06) + total;
    }
}
