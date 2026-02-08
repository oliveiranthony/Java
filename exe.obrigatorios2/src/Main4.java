import java.util.Scanner;
import java.util.Locale;

public class Main4 {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		System.out.println("Escolha uma opção:");
		int op = sc.nextInt();
		System.out.println("Digite a quantidade:");
		int qtd = sc.nextInt();
		double price;
		if(op == 1) {
			price = qtd * 4.00;
			System.out.printf("Total a pagar: R$%.2f\n", price);
		} else if (op == 2) {
			price = qtd * 4.50;
			System.out.printf("Total a pagar: R$%.2f\n", price);
		} else if (op == 3) {
			price = qtd * 5.00;
			System.out.printf("Total a pagar: R$%.2f\n", price);
		} else if (op == 4) {
			price = qtd * 2.00;
			System.out.printf("Total a pagar: R$%.2f\n", price);
		} else if (op == 5) {
			price = qtd * 1.50;
			System.out.printf("Total a pagar: R$%.2f\n", price);
		} else {
			System.out.println("Opcao invalida");
		}
		
		sc.close();
	}
}
