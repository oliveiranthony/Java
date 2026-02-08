package application;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] vect = new int[n];
		
		int vetores;
		for (int i = 0; i < vect.length; i++) {
			vetores = sc.nextInt();
			vect[i] = vetores;
		}
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print(vect[i] + " " );
		}
		
		sc.close();
	}

}
