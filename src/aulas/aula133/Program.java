package aulas.aula133;

import aulas.aula133.entities.Circle;
import aulas.aula133.entities.Color;
import aulas.aula133.entities.Rectangle;
import aulas.aula133.entities.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Shape> list = new ArrayList<Shape>();

        System.out.print("Enter the number of shapes: ");
        int shapes = sc.nextInt();

        for(int i=1; i<=shapes;i++){
            System.out.println("Shape #" + i + " data:");
            System.out.print("Rectangle or circle(r/c)? ");
            char shapeType = sc.next().charAt(0);

            System.out.print("Color (BLACK/BLUE/RED): ");
            String color = sc.next();

            if(shapeType == 'r'){
                System.out.print("Width: ");
                double width = sc.nextInt();
                System.out.print("Height: ");
                double height = sc.nextInt();

                list.add(new Rectangle(Color.valueOf(color),width, height));
            }
            if(shapeType == 'c'){
                System.out.print("Radius: ");
                double radius = sc.nextDouble();

                list.add(new Circle(Color.valueOf(color), radius));
            }
        }
        System.out.println("Shape areas: ");
        for (Shape c : list){
            System.out.printf("%.2f%n", c.area());
        }


    }

}
