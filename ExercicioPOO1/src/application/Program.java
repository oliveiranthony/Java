package application;
import entidade.Rectangle;
import java.util.Scanner;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Rectangle Rectangle = new Rectangle();
		System.out.println("Digite o valor da Largura e da Altura do Retangulo: ");
		System.out.print("Largura: ");
		Rectangle.Largura = sc.nextDouble();
		System.out.print("Altura: ");
		Rectangle.Altura = sc.nextDouble();
		
		Rectangle.Area();
		System.out.printf("Area: %.2f\n", Rectangle.Area());
		Rectangle.Perimeter();
		System.out.printf("Perimetro: %.2f\n", Rectangle.Perimeter());
		Rectangle.Diagonal();
		System.out.printf("Diagonal: %.2f", Rectangle.Diagonal());
		
		sc.close();
	}

}
