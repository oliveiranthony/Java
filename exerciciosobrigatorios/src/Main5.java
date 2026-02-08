import java.util.Scanner;
import java.util.Locale;

public class Main5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int cod1 = sc.nextInt();
		int npecas1 = sc.nextInt();
		double valorpecas1 = sc.nextDouble();
		int cod2 = sc.nextInt();
		int npecas2 = sc.nextInt();
		double valorpecas2 = sc.nextDouble();
		double resultado = (npecas1 * valorpecas1) + (npecas2 * valorpecas2);
		
		System.out.printf("VALOR A PAGAR: R$%.2f\n", resultado);
		sc.close();
	}
}
