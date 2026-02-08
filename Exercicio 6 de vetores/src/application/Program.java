package application;
import entidade.Soma;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.print("Quantos numeros serao digitados ? ");
		int n = sc.nextInt();
		Soma[] vect = new Soma[n];
		
		double a, b = 0,c = 0;
		System.out.println("Digite os valores dos vetores A:");
		for (int i = 0; i < vect.length; i++) {
			a = sc.nextInt();
			vect[i].setA();
			System.out.println(vect[i].getA());
			vect[i] = new Soma(a, b, c);
		}
		
		System.out.println("Digite os valores dos vetores B:");
		for (int i = 0; i < vect.length; i++) {
			b = sc.nextInt();
			System.out.println(vect[i].getB());
		}
		
		
		
		sc.close();
	}

}
