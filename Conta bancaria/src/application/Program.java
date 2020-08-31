/*
 Nome: Gustavo Henrique Zenke
 Exercicio do curso de Java Completo Udemy
 Link: https://www.udemy.com/course/java-curso-completo/
 
 	Enunciado: 
 	
 	Em um banco, para se cadastrar uma conta bancária, é necessário informar o número da conta, o nome do
	titular da conta, e o valor de depósito inicial que o titular depositou ao abrir a conta. Este valor de depósito
	inicial, entretanto, é opcional, ou seja: se o titular não tiver dinheiro a depositar no momento de abrir sua
	conta, o depósito inicial não será feito e o saldo inicial da conta será, naturalmente, zero.
	Importante: uma vez que uma conta bancária foi aberta, o número da conta nunca poderá ser alterado. Já
	o nome do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasião de casamento, por
	exemplo).
	Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para proteger
	isso. O saldo só aumenta por meio de depósitos, e só diminui por meio de saques. Para cada saque
	realizado, o banco cobra uma taxa de $ 5.00. Nota: a conta pode ficar com saldo negativo se o saldo não for
	suficiente para realizar o saque e/ou pagar a taxa.
	Você deve fazer um programa que realize o cadastro de uma conta, dando opção para que seja ou não
	informado o valor de depósito inicial. Em seguida, realizar um depósito e depois um saque, sempre
	mostrando os dados da conta após cada operação. 
*/

package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Conta;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter account number: ");
		long account_number = sc.nextLong();
		
		sc.nextLine();
		System.out.println("Enter account holder: ");
		String titular_name = sc.nextLine();
		
		System.out.println("Is there an inicial deposit (y/n)? ");
		char initial_deposit = sc.next().charAt(0);
		
		double initial_deposit_value = 0.0;
		Conta cc;
		
		if (initial_deposit == 'y' || initial_deposit == 'Y') {
			System.out.println("Enter initial deposit value");
			initial_deposit_value = sc.nextDouble();
			cc = new Conta(account_number, titular_name, initial_deposit_value);
		} else {
			cc = new Conta(account_number, titular_name);
		}
		
		System.out.println("Account data:\n" + cc.toString());
		
		System.out.println("Enter a deposit value: ");
		cc.deposit(sc.nextDouble());
		System.out.println("Updated account data:\n" + cc.toString());
		
		System.out.println("Enter a withdraw value: ");
		cc.withdraw(sc.nextDouble());
		System.out.println("Updated account data:\n" + cc.toString());
		
		sc.close();
	}

}
