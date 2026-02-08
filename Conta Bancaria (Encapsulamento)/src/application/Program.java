package application;
import Service.contaBancaria;
import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		contaBancaria cB = new contaBancaria();
		System.out.println("Titular: ");
		String titular = sc.nextLine();
		contaBancaria.setTitular("Anthony");
		
		}
}
