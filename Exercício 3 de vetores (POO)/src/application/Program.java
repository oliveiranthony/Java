package application;
import util.Alturas;
import java.util.Scanner;
import java.util.Locale;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Quantas pessoas serao digitadas ? ");
		int quantidade = sc.nextInt();
		Alturas[] vect = new Alturas[quantidade];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.printf("Dados da %dº pessoa: \n", i + 1);
			System.out.print("Nome: ");
			sc.nextLine();
			String nomes = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			vect[i] = new Alturas(nomes, idade, altura);
		}
		
		double soma = 0;
		for (int i = 0; i < vect.length; i++) {
			soma += vect[i].getAltura();
		}
		
		double media = 0;
		media = soma / vect.length;
		System.out.printf("Altura media: %.2f\n", media);
		
		double porcentagemIdade = 0;
		int contagemMenores = 0;
		String menores;
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getIdade() < 16)
			contagemMenores++;
			vect[i].getNomes();
		}
		porcentagemIdade = (double) contagemMenores / vect.length * 100;
		System.out.printf("Menores de 16 anos: %.0f%%\n", porcentagemIdade);
		sc.nextLine();
		
		for(int i = 0; i < vect.length; i++) {
			if (vect[i].getIdade() < 16)
			System.out.println(vect[i].getNomes());
		}		
		
		sc.close();
	}
}
