package application;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Linhas: ");
		int m = sc.nextInt();
		System.out.print("Colunas: ");
		int n = sc.nextInt();
		int[][] matriz = new int[m][n];
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Insira o numero da matriz e o programa mostrara informacoes: ");
		int x = sc.nextInt();
		for (int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				if (x == matriz[i][j]) {
					System.out.println("Posição: " + i + ", " + j);
					System.out.println("Esquerda: " + matriz[i][j - 1]);
					System.out.println("Direita: "  + matriz[i][j + 1]);
					System.out.println("Acima: "  + matriz[j][i - 1]);
					System.out.println("Abaixo: " + matriz[j][j + 1]);
				}
			}
		}
		
		sc.close();
	}
}
