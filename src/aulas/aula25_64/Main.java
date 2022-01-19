package aulas.aula25_64;

import java.util.Locale;

public class Main {

	//Ponto de entrada, onde nossa aplica��o vai come�ar
	public static void main(String[] args) {
		//Aqui iremos botar nosso algoritimo
		
		
		int y = 32;
		double x = 10.65464;
		
		System.out.println(y);
		System.out.println(x);
		
		System.out.printf("%.2f%n", x); //Formata��o de casas decimais
		
		Locale.setDefault(Locale.US); 
		System.out.printf("%.2f%n", x); 
		
		//Concatenar v�rios elementos em um mesmo comando de escrita
		System.out.println("RESULTADO = " + x + " METROS");
		
		//Concatenar com printf
		System.out.printf("RESULTADO = %.2f metros%n", x);
		
		//Concatenar v�rios elementos em um mesmo comando de escrita e 
		//Com muitas variaveis
		
		String nome = "Maria";
		String pais = "Brasil";
		int idade = 31;
		double renda = 4000.0;
		

		//%f = ponto flutuante
		//%d = inteiro
		//%s = texto
		//%n = quebra de linha

		System.out.printf("%s tem %d anos e ganha R$ %.2f reais e mora no %s%n", nome, idade, renda, pais);
		
	}
	

}
