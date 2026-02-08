import java.util.Scanner;

public class main {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite um numero");
		int x = sc.nextInt();
		if (x >= 0) {
			System.out.printf("Este numero e positivo!");
		} else {
			System.out.printf("Este numero e negativo");
		}
		sc.close();
	}
}
