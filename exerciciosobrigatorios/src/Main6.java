import java.util.Scanner;
import java.util.Locale;

public class Main6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		System.out.printf("TRIANGULO: %.3f\n", (a * c) / 2);
		System.out.printf("CIRCULO: %.3f\n", 3.14 * Math.pow(c, 2));
		System.out.printf("TRAPEZIO: %.3f\n", (( a + b ) * c) / 2);
		System.out.printf("QUADRADO: %.3f\n", Math.pow(b, 2));
		System.out.printf("RETANGULO: %.3f\n", a * b);
		
		sc.close();
	}
}
