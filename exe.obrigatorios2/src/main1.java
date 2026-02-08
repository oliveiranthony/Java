import java.util.Scanner;

public class main1 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int n = sc.nextInt();
		if (n % 2 == 0) {
			System.out.println("Este numero e par");
		} else {
				System.out.println("Este numero e impar");
			}
	}
}
