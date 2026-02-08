import java.util.Scanner;
import java.util.Locale;

public class Main6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.println("Digite um numero para X: ");
		double x = sc.nextDouble();
		System.out.println("Digite um numero para Y: ");
		double y = sc.nextDouble();
		if(x > 0 && y > 0) {
			System.out.println("Quadrante 1");
		} else if (x < 0 && y > 0) {
			System.out.println("Quadrante 2");
		} else if (x < 0 && y < 0) {
			System.out.println("Quadrante 3");
		} else if (x > 0 && y < 0) {
			System.out.println("Quadrante 4");
		} else {
			System.out.println("Origem (0)");
		}
		sc.close();
	}
}
