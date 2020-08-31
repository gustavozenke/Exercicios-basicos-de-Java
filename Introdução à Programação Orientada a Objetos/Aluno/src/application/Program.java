/*
 Nome: Gustavo Henrique Zenke
 Exercicio do curso de Java Completo Udemy
 Link: https://www.udemy.com/course/java-curso-completo/
 
 	Enunciado: 
	Fazer um programa para ler o nome de um aluno e as tr�s notas que ele obteve nos tr�s trimestres do ano
	(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no
	ano. Dizer tamb�m se o aluno est� aprovado (PASS) ou n�o (FAILED) e, em caso negativo, quantos pontos faltam
	para o aluno obter o m�nimo para ser aprovado (que � 60% da nota). Voc� deve criar uma classe Student para
	resolver este problema.
*/

package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student a1 = new Student();
		
		a1.setName(sc.nextLine());
		a1.setGrade1(sc.nextDouble());
		a1.setGrade2(sc.nextDouble());
		a1.setGrade3(sc.nextDouble());

		System.out.println("FINAL GRADE = " + String.format("%.2f", a1.finalGrade()));
		
		if(a1.finalGrade() >= 60.0)
			System.out.println("PASS");
		else
			System.out.println("FAILED\nMISSING " + String.format("%.2f", a1.missingPoints()) + " POINTS");
		
		sc.close();
			
	}

}
