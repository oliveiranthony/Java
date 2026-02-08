package application;
import entidade.MaiorNumero;
import java.util.Scanner;
import java.util.Locale;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Quantos numeros serao digitados ? ");
		int n = sc.nextInt();
		sc.nextLine();
		MaiorNumero[] vect = new MaiorNumero[n];
		
		double nMaior = 0;
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			nMaior = sc.nextDouble();
			vect[i] = new MaiorNumero(n, nMaior);
		}
		System.out.println();
		
		System.out.print("Maior valor = ");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getnMaior() > nMaior) {
				nMaior = vect[i].getnMaior();
			} 
		}
		System.out.println(nMaior);
		
		System.out.println("Posicao do vetor: ");
		for (int i = 0; i < vect.length; i++) {
			
		}
		
		sc.close();
	}
}
