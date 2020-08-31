/*
 Nome: Gustavo Henrique Zenke
 Exercicio do curso de Java Completo Udemy
 Link: https://www.udemy.com/course/java-curso-completo/
 
 	Enunciado: 
	Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por
	uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda
	que a pessoa terá que pagar 6% de IOF sobre o valor em dólar. Criar uma classe CurrencyConverter
	para ser responsável pelos cálculos.
*/

package application;
import java.util.Locale;
import java.util.Scanner;
import utils.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		
		System.out.println("How many dollars will be bought? ");
		double quantity = sc.nextDouble();
		
		System.out.println("Amount to be paid in reais: " + CurrencyConverter.convertToReais(dollarPrice, quantity));
		
		sc.close();
	}

}
