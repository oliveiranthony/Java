import java.util.Scanner;
import java.util.Locale;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double pi = 3.14;
		System.out.println("Digite o valor do raio: ");
		double raio = sc.nextDouble ();
		double area = pi * Math.pow(raio,2);
		
		System.out.printf("Valor do raio digitado: %.1f\n", raio);
		System.out.printf("O valor da area deste circulo eh de: %.4f", area);
		
		sc.close();
	}

}
