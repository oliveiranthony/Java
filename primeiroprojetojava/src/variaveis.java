import java.util.Locale;

public class variaveis {

	public static void main (String[] args) {
	Locale.setDefault(Locale.US);
		int x = 10;
		double y = 52.09214;
		
		System.out.println(y);
		System.out.printf("%.2f\n", y);
		System.out.println(x);
		System.out.println("RESULTADO = " + y + " METROS");
		System.out.printf("RESULTADO = %.2f METROS", y);
	}
}
