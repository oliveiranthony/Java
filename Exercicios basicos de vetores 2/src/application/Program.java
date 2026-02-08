package application;
import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Quantos numeros? ");
		int n = sc.nextInt();
		int[] vect = new int[n];
		
		double soma = 0;
		double numeros = 0;
		for (int i = 0; i < vect.length; i++) {
			numeros = sc.nextDouble();
			soma += numeros;
		}
		
		System.out.print("Numeros: ");
		for (int i = 0; i < vect.length; i++) {
			System.out.print(numeros + " ");
		}
		System.out.print("\nSoma dos numeros = " + soma);
		
		
		sc.close();
	}
}
