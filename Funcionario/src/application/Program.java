/*
 Nome: Gustavo Henrique Zenke
 Exercicio do curso de Java Completo Udemy
 Link: https://www.udemy.com/course/java-curso-completo/
 
 	Enunciado: 
	Fazer um programa para ler os dados de um funcion�rio (nome, sal�rio bruto e imposto). Em
	seguida, mostrar os dados do funcion�rio (nome e sal�rio l�quido). Em seguida, aumentar o
	sal�rio do funcion�rio com base em uma porcentagem dada (somente o sal�rio bruto �
	afetado pela porcentagem) e mostrar novamente os dados do funcion�rio. Use a classe
	projetada abaixo.
*/

package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Funcionario f1 = new Funcionario();
		
		System.out.println("Nome: ");
		f1.setNome(sc.nextLine());
		
		System.out.println("Salario bruto: ");
		f1.setSalarioBruto(sc.nextDouble());
		
		System.out.println("Tax: ");
		f1.setImposto(sc.nextDouble());
		
		System.out.println("Empregado: " + f1);
		
		System.out.println("\nPorcentagem que deseja aumentar o salario: ");
		f1.increaseSalary(sc.nextDouble());
		
		System.out.println("Salario incrementado: " + f1.SalarioLiquido());
		
		sc.close();
	}

}
