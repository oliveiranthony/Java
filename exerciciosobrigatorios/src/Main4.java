import java.util.Scanner;
import java.util.Locale;

public class Main4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int func = sc.nextInt();
		double horas = sc.nextDouble();
		double valorporhora = sc.nextDouble();
		double resultado = horas * valorporhora;
		
		System.out.printf("O Salario do funcionario %d eh = R$%.2f\n",func, resultado);
		sc.close();
	}
}
