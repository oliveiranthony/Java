package application;
import Servico.Estudante;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Estudante estudante = new Estudante();
		
		System.out.println("Digite o nome do aluno");
		estudante.Aluno = sc.nextLine();
		System.out.print("Nota 1o Trimestre: ");
		estudante.nota1 = sc.nextDouble();
		System.out.print("Nota 2o Trimestre: ");
		estudante.nota2 = sc.nextDouble();
		System.out.print("Nota 3o Trimestre: ");
		estudante.nota3 = sc.nextDouble();
		
		if(estudante.notaTotal() > 60) {
			System.out.printf("Nota Final: %.2f\n", estudante.notaTotal());
			System.out.println("Aprovado");
		} else {
			System.out.printf("Nota Final: %.2f\n", estudante.notaTotal());
			System.out.println("Reprovado");
			System.out.printf("Restaram %.2f pontos para ser aprovado.", estudante.pontosRestantes());
		}
		
		sc.close();
	}
}
