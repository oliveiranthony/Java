import java.util.Locale;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		char resp;
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			double C = sc.nextDouble();
			double F = 9.00 * C / 5.00 + 32.00;
			System.out.printf("Equivalente em Fahrenheit: %.1f\n", F);
			System.out.println("Deseja repetir o programa ? (s/n)");
			resp = sc.next().charAt(0);
		} while (resp == 's');
		if (resp != 's') {
			System.out.println("Programa encerrado");
		}

		sc.close();
	}
}
