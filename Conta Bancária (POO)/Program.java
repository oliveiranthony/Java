package application;
import entidade.contaBancaria;
import java.util.Scanner;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
		int numeroConta;
		String titular; 
		double saldo = 0;
		double deposito = 0;
		double saque = 0;
		System.out.print("Insira o numero da conta: ");
		numeroConta = sc.nextInt();
		sc.nextLine();
		System.out.print("Nome do titular: ");
		titular = sc.nextLine();
		System.out.print("Deseja depositar um valor inicial? (s/n)");
		char opcao = sc.next().charAt(0);
		if (opcao == 's') {
			System.out.print("Quanto deseja depositar ? R$");
			deposito = sc.nextDouble();
			saldo += deposito;
		} else {
			System.out.println("Sua conta se iniciara com o valor de R$0.00");
		}
		contaBancaria conta = new contaBancaria(numeroConta, titular, saldo, deposito, saque);
		
		System.out.println();
		System.out.println("Dados da conta:");
		System.out.println("Conta: " + conta.getNumeroConta() + "," 
						   + "Titular: " + conta.getTitular() + "," 
						   + "Saldo: R$" + conta.getSaldo());
		
		System.out.println();
		System.out.println("Escolha uma opcao: Digite 0 para realizar um deposito e 1 para saque");
		int escolha = sc.nextInt();
		if (escolha == 0) {
			System.out.print("Digite o valor do deposito: R$");
			deposito = sc. nextDouble();
			conta.setDeposito(deposito);
			conta.getDeposito();
			System.out.println(conta.valorDeposito());
		} else if (escolha == 1) {
			System.out.print("Digite o valor do saque: R$");
			saque = sc.nextDouble();
			conta.setSaque(saque);
			conta.getSaque();
			System.out.println(conta.valorSaque());
		}
		
		sc.close();
	}

}
