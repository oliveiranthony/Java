package application;
import Servico.Funcionario;
import java.util.Scanner;
import java.util.Locale;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Funcionario funcionario = new Funcionario();
		System.out.print("Nome: ");
		funcionario.nome = sc.nextLine();
		System.out.print("Salario Bruto: ");
		funcionario.salarioBruto = sc.nextDouble();
		System.out.print("Taxa: ");
		funcionario.taxa = sc.nextDouble();
		
		System.out.println( );
		System.out.println("Funcionario: " + funcionario.nome + ", " + "$ " + funcionario.salarioLiquido());
		System.out.print("Qual a porcentagem do aumento do salario ? ");
		double percentual = sc.nextDouble();
		funcionario.taxaDeAumento(percentual);
		System.out.print("Dados atualizados: " + funcionario.nome + ", $ " + funcionario.salarioLiquido());
		
		sc.close();
	}
}
