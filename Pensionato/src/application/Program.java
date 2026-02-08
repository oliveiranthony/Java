package application;
import Service.AluguelQuartos;
import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Quantos quartos serão alugados ? ");
		int n = sc.nextInt();
		AluguelQuartos[] vect = new AluguelQuartos[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.println("Aluguel #" + i + ":");
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
			vect[i] = new AluguelQuartos(nome, email, quarto);
		}
		
		System.out.println("Quartos alugados: ");
		for (int i = 0; i < vect.length; i++) {
			System.out.print(vect[i].getQuarto() + " " 
							+ vect[i].getNome() + " " 
							+ vect[i].getEmail());
		}
		
	sc.close();
	}
}
