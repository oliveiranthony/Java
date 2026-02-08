import java.util.Scanner;

public class Main3 {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Hora inicial do jogo: ");
		int horaI = sc.nextInt();
		System.out.println("Digite a hora final do jogo: ");
		int horaF = sc.nextInt();
		int duracao;
		if (horaI < horaF) {
			duracao = horaF - horaI;
		} else {
			duracao = 24 - horaI + horaF;
		}
		System.out.printf("O jogo durou %d horas", duracao);
		sc.close();
	}
}
