/*
 Nome: Gustavo Henrique Zenke
 Exercicio do curso de Java Completo Udemy
 Link: https://www.udemy.com/course/java-curso-completo/
 
 	Enunciado: 
	Fazer um programa para ler os valores da largura e altura
	de um retângulo. Em seguida, mostrar na tela o valor de
	sua área, perímetro e diagonal. Usar uma classe como
	mostrado no projeto ao lado.
*/


package application;
import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Rectangle r1 = new Rectangle();
		
		System.out.println("Enter rectangle width and height: ");
		r1.setHeight(sc.nextDouble());
		r1.setWidth(sc.nextDouble());
		
		System.out.println("Area: " 
		+ String.format("%.2f", r1.Area())
		+ "\nPerimeter: "
		+ String.format("%.2f", r1.Perimeter())
		+ "\nDiagonal: "
		+ String.format("%.2f", r1.Diagonal()));
		
		sc.close();
		
	}
}
