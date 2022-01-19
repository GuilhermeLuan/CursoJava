package aulas.aula93;

public class Program {
    public static void main(String[] args) {
        String[] vector = new String[] {"Maria", "Bob", "Alex"};

        for(int i=0; i<vector.length; i++){
            System.out.println(vector[i]);
        }
        System.out.println("---------------");

        //Laço for each
        for (String obj : vector){
            System.out.println(obj);
        }
    }
}
