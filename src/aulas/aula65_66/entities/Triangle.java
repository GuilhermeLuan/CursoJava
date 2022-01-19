package aulas.aula65_66.entities;

//Classe -> Difinição do tipo, onde vai "falar" que o triangulo possuiu o a,b,c
public class Triangle {
    //Atrib
    public double a;
    public double b;
    public double c;

    //METODO PARA CALCULAR AREA - FUNCAO
    public double area(){
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
