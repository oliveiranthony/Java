package application;
import entidade.Product;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Digite a quantidade de produtos: ");
		int n = sc.nextInt();
		Product[] vect = new Product[n];
		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();		
		String name = sc.nextLine();
		double price = sc.nextDouble();
		vect[i] = new Product(name, price);
		}
		double soma = 0;
		for (int i = 0; i < vect.length; i++) {
			soma += vect[i].getPreco();
		}
		double avg = soma / vect.length;
		System.out.println("Media = " + avg);

		sc.close();
	}

}
