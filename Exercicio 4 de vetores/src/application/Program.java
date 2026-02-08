package application;
import entidade.NumerosPares;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Quantos numeros vai digitar ? ");
		int n  = sc.nextInt();
		NumerosPares[] vect = new NumerosPares[n];
		
		int numPares = 0;
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			numPares = sc.nextInt();
			vect[i] = new NumerosPares(numPares);
		}
		System.out.println();
		
		System.out.print("Numeros pares:");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getnumPares() % 2 == 0) 
				System.out.print(" " + vect[i].getnumPares());
			}
		
		int contagemPares = 0;
		System.out.print("Quantidade de numeros pares:");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getnumPares() % 2 == 0) {
				contagemPares++;
			}	
		}
		System.out.println(contagemPares);
		
		
		sc.close();
	}

}
