import java.util.Scanner;
	
public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o quanto eu te amo: ");
		double LoveYou = sc.nextDouble();
		
		if (LoveYou > 1000000000) {
			System.out.println("Voce eh tao importante pra mim... Ainda bem que sabe que amo alem desse valor!");
		} else {
			System.out.println("10");
		}
		sc.close();
	}
}
