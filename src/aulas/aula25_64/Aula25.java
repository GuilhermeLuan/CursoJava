package aulas.aula25_64;

public class Aula25 {

    public static void main(String[] args) {
        int a,b;
        double soma;

        a = 5;
        b = 2;

        soma = (double) a / b;
        //Se n�o utilizamos a fun��o casting o resultado seria uma int e n�o double
        System.out.println(soma);
    }


}
