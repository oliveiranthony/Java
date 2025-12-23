import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int opcao, n1, n2, resultado;
		double x, y, r;
		System.out.println("Primeiro, escolha o sinal aritmetico!");
		System.out.println("Digite 1 para adicao:");
		System.out.println("Digite 2 para subtracao:");
		System.out.println("Digite 3 para multiplicacao:");
		System.out.println("Digite 4 para divisao:");
		System.out.println("Digite 5 para calcular a potencia do numero digitado :");
		System.out.println("Digite 6 para calcular a raiz quadrada do numero digitado:");
		opcao = sc.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("Digite o primeiro numero: ");
			n1 = sc.nextInt();
			System.out.println("Digite o segundo numero: ");
			n2 = sc.nextInt();
			resultado = n1 + n2;
			System.out.printf("O resultado eh: %d ",resultado);
			break;
		case 2:
			System.out.println("Digite o primeiro numero: ");
			n1 = sc.nextInt();
			System.out.println("Digite o segundo numero: ");
			n2 = sc.nextInt();
			resultado = n1 - n2;
			System.out.printf("O resultado eh: %d ",resultado);
			break;
		case 3:
			System.out.println("Digite o primeiro numero: ");
			n1 = sc.nextInt();
			System.out.println("Digite o segundo numero: ");
			n2 = sc.nextInt();
			resultado = n1 * n2;
			System.out.printf("O resultado eh: %d ",resultado);
			break;
		case 4:
			System.out.println("Digite o primeiro numero: ");
			n1 = sc.nextInt();
			System.out.println("Digite o segundo numero: ");
			n2 = sc.nextInt();
			resultado = n1 / n2;
			if ( n2 == 0) {
				System.out.println("Nao eh possivel dividir por 0");
			}
			System.out.printf("O resultado eh: %d ",resultado);
			break;
		case 5:
			System.out.println("Digite o primeiro numero: ");
			x = sc.nextDouble();
			System.out.println("Digite o segundo numero (Potencia): ");
			y = sc.nextDouble();
			r = Math.pow(x, y);
			System.out.printf("O resultado eh: %.2f ",r);
			break;
		case 6:
			System.out.println("Digite o numero para obter a raiz quadrada: ");
			n1 = sc.nextInt();
			r = Math.sqrt(n1);
			System.out.printf("O resultado eh: %.3f ",r);
			break;
			default:
				System.out.println("Valor invalido");
				break;
		}
		sc.close();
	}
}
