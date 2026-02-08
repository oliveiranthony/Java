package application;
import java.util.Scanner;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Quantos numeros serao digitados ? ");
		int n = sc.nextInt();
		int[] vect = new int[n];
		
		double numeros = 0;
		double soma = 0;
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			numeros = sc.nextDouble();
			soma += numeros;
		}
		System.out.println("Soma = " + numeros);
		
		double media = 0;
		media = soma / vect.length;
		System.out.println("Media = " + media);
		
		sc.close();
	}

}
