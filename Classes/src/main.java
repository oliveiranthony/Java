import java.util.Locale;
import java.util.Scanner;
import entities.Triangulo;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();

		double p;
		System.out.println("Insira as medidas do Triangulo X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Insira as medidas do Triangulo Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Area do Triangulo X: %.2f\n", areaX);
		System.out.printf("Area do Triangulo Y: %.2f\n", areaY);
		if (areaX > areaY) {
			System.out.println("Triangulo X tem maior area");
		} else {
			System.out.println("Triangulo Y tem maior area");
		}

		sc.close();
	}
}