import java.util.Scanner;
import java.util.Locale;

public class Main7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.println("Digite o salario: ");
		double salario = sc.nextDouble();
		double imposto;
		if (salario >= 0 && salario <= 2000.00) {
			System.out.println("Isento de taxa");
		} else if (salario > 2000.00 && salario <= 3000.00) {
			imposto = (salario - 2000) * 0.008;
			System.out.printf("R$%.2f\n", imposto);
		} else if (salario > 3000.00 && salario <= 4500.00) {
			imposto = (1000 * 0.08) + (salario - 3000.00) * 0.18;
			System.out.printf("R$%.2f\n", imposto);
		} else if (salario > 4500.00) {
			imposto = (1000 * 0.08) + (1500 * 0.18) + (salario - 4500.00) * 0.28;
			System.out.printf("R$%.2f\n", imposto);
		}
		sc.close();
	}
}
