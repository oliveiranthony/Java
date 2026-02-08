import java.util.Scanner;
import java.util.Locale;

public class main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int minutos = sc.nextInt();
		double conta = 50.00;
		
		if (minutos > 100) {
			conta += (minutos - 100) * 2.0;
		}
		System.out.printf("R$%.2f\n", conta);
		sc.close();
	}
}
