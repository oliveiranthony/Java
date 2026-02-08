package application;
import util.CurrencyConverter;
import java.util.Scanner;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Preco do Dolar atualmente (31/12/2025): $" + CurrencyConverter.DOLAR);
		System.out.printf("Quantos dolares deseja comprar ? $ ");
		double compra = sc.nextDouble();
		System.out.printf("Valor convertido em reais: R$%.2f", CurrencyConverter.total(compra));
		
		sc.close();
	}
}
