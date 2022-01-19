package aulas.aula25_64;

public class Aula59 {
    public static void main(String[] args) {
        String original = "abcde FGHIJ ABC abc DEFG   ";

        String s01 = original.toLowerCase(); //Transforma tudo em minusculo
        String s02 = original.toUpperCase(); //Transforma tudo em maisculo
        String s03 = original.trim(); //Remove os espaços
        String s04 = original.substring(2); //Pega apartir do 2 caractere e monta uma nova string
        String s05 = original.substring(2, 9); //Pega apartir do 2 caractere e monta uma nova string ate o 9
        String s06 = original.replace('a', 'x'); //Troca os caracteres 'a' pelo 'x'
        String s07 = original.replace("abc", "xy");
        int i = original.indexOf("bc"); //Primeira ocorencia do valor "BC"
        int j = original.lastIndexOf("bc"); //Ultima ocorrencia do valor "bc"

        System.out.println("Original -" + original + "-");
        System.out.println("toLoweCase -" + s01 + "-");
        System.out.println("toLUpperCase -" + s02 + "-");
        System.out.println("trim -" + s03 + "-");
        System.out.println("substring(2) -" + s04 + "-");
        System.out.println("substring(2, 9) -" + s05 + "-");
        System.out.println("replace('a', 'x') -" + s06 + "-");
        System.out.println("original.replace(abc, xy) -" + s07 + "-");
        System.out.println("Index of bc:" + i);
        System.out.println("Last Index of bc:" + j);

        //Operação split
        String s = "potato apple lemon";

        String[] vector = s.split(" "); //Declaração de um vector

        System.out.println(vector[0]);
        System.out.println(vector[1]);
        System.out.println(vector[2]);
    }
}
