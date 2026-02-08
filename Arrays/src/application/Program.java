package application;
import java.util.Scanner;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		/*Fazer um programa para ler um número inteiro N e a altura de N
		pessoas. Armazene as N alturas em um vetor.Em seguida, mostrar a
		altura média dessas pessoas.*/
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for(int i = 0; i < n; i++) {
			vect[i] = sc.nextDouble();
		}
		
		double soma = 0.0;
		for (int i = 0; i < n; i++) {
			soma += vect[i];
		}
		
		double altura = soma / n;
		System.out.println("Altura media: " + altura);
		
		sc.close();
	}

}
