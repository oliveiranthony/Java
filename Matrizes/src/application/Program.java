package application;
import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int n = sc.nextInt();
		int[][] matriz = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			for ( int j = 0; j < n; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Diagonal principal: ");
		for (int i = 0; i < n; i++) {
			System.out.print(matriz[i][i] + " ");
		}
		System.out.println();
		
		int nNegativos = 0;
		for (int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if (matriz[i][j] < 0) {
					nNegativos++;
				}
			}
		}
		System.out.println("Numeros negativos: " + nNegativos);
		sc.close();
	}
}
