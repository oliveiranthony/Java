package application;

import Service.Docente;
import java.util.Scanner;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int bimestre;
		double nota;

		System.out.print("Docente Responsavel pelo cadastro de notas: ");
		String usuario = sc.nextLine();
		Docente.setUsuario(usuario);
		
		bimestre = sc.nextInt();
		do {
			if (bimestre == 1) {
				System.out.println("Digite a nota do 1º Bimestre");
			} else if (bimestre == 2) {
				System.out.println("Digite a nota do 1º Bimestre");
			} else if (bimestre == 3) {
				System.out.println("Digite a nota do 1º Bimestre");
			} else if (bimestre == 4) {
				System.out.println("Digite a nota do 1º Bimestre");
			}
		} while (bimestre < 1 && bimestre > 4);
		
		sc.close();
	}

}
