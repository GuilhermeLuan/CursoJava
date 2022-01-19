package aulas.aula68.util;

public class Calculator {

    public static double pi(){
        return Math.PI;
    }

    public static double circumference(double radius){
        return 2 * Math.PI * radius;
    }
    public static double volume(double radius){
        return (4 * Math.PI * Math.pow(radius, 3)) / 3;
    }

}
