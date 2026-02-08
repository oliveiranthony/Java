import java.util.Scanner;
import java.util.Locale;

public class entrada {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String s;
		s = sc.next();
		System.out.println("Voce digitou a palavra:" + s);

		int x;
		x = sc.nextInt();
		System.out.println("Voce digitou o numero inteiro: " + x);

		double d;
		d = sc.nextDouble();
		System.out.printf("Voce digitou o numero decimal: %.2f\n ", d);

		char c;
		c = sc.next().charAt(0);
		System.out.println("Voce digitou a letra: " + c);

		sc.close();
	}
}
