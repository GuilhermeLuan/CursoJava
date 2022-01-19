package aulas.aula25_64;

public class Aula41 {
    public static void main(String[] args) {

        double price = 400.00;
        // Declaraçõa da variavel -> inicialização dela com o numero 400.00

        // Toda variavel declarada dentro da estrutura so vai exister quando ela for executada
        double discount = 0;

        if (price < 200) {
            discount = price * 0.1;
        }

        System.out.print(discount);
    }
}
