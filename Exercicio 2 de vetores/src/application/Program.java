package application;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Quantos numeros vai digitar ? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();;
		}
		
		System.out.print("Valores =");
		for (int i = 0; i < n; i++) {
			System.out.print( " " + vect[i]);
		}
		
		double soma = 0;
		System.out.printf("\nSoma = ");
		for (int i = 0; i < vect.length; i++) {
		soma += vect[i];
		}
		System.out.println(soma);
		
		double media = 0;
		System.out.print("Media = ");
		for (int i = 0; i < n; i++) {
			media = soma / n;
		}
		System.out.println(media);
		
		sc.close();
	}

}
