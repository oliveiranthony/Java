import java.util.Scanner;
import java.util.Locale;

public class Main5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.println("Digite um numero: ");
		double n = sc.nextDouble();
		if (n < 0 || n > 100) {
			System.out.println("Fora do intervalo");
		} else if (n >= 0 && n <= 25) {
			System.out.println("[0,25]");
		} else if (n > 25 && n <= 50) {
			System.out.println("(25,50]");
		} else if (n > 50 && n <= 75) {
			System.out.println("(50,75]");
		} else if (n > 75 && n <= 100) {
			System.out.println("(75,100]");
		}
		sc.close();
	}
}
