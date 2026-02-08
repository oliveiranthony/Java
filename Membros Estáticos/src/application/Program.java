package application;
import util.Calculator;
import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Digite um valor qualquer de um raio: ");
		double raio = sc.nextDouble();
		double circunferencia = Calculator.circunferencia(raio);
		double volume = Calculator.volume(raio);
		
		System.out.println("Circunferencia: " + circunferencia);
		System.out.println("Volume: " + volume);
		System.out.println("Valor de PI: " + Calculator.PI);
		
		sc.close();
	}
}
