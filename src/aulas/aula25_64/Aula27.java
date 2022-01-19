package aulas.aula25_64;

public class Aula27 {
    public static void main(String[] args) {

        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double A, B, C;


        A = Math.sqrt(x); //A recebe raiz quadrada de X
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);
        System.out.printf("Raiz quadrada de %f = %f%n", x, A);
        System.out.printf("Raiz quadrada de %.2f = %.2f%n", y, B);
        System.out.println("Raiz quadrade de 25 = " + C);

        A = Math.pow(x, y); //A recebe x elevado a y
        B = Math.pow(x, 2.0);
        C = Math.pow(5.0, 2.0);
        System.out.printf("%.2f elevado a %.2f = %.2f%n", x, y, A);
        System.out.printf("%.2f elevado ao quadrado = %.2f%n", x, B);
        System.out.println("5 elevado ao quadrado = " + C);

        A = Math.abs(y);
        B = Math.abs(z);
        System.out.printf("Valor absoluto de %.2f = %.2f%n", y, A);
        System.out.printf("Valor absoluto de %.2f = %.2f ", z, B);
    }
}
