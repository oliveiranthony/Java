package application;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int n = sc.nextInt();
		int[] vect = new int[n];
		
		double numeros = 0;
		for (int i = 0; i < vect.length; i++) {
			System.out.println("Digite um numero: ");
			numeros = sc.nextDouble();
		}
		
		
 	
		sc.close();
		}
}
