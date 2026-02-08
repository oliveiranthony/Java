package application;
import entidade.Product;
import java.util.Scanner;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Insira os dados do produto: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Preco: R$");
		double preco = sc.nextDouble();
		System.out.print("Quantidade em estoque: ");
		int quantidade = sc.nextInt();
		Product product = new Product(nome, preco, quantidade);
		
		System.out.println(product.toString());
		
		System.out.print("Digite a quantidade de produtos que irao ser adicionados ao estoque: ");
		quantidade = sc.nextInt();
		product.addAoEstoque(quantidade);
		System.out.println("Dados atualizado: " + product);
		
		System.out.print("Digite a quantidade de produtos que irao ser removidos do estoque: ");
		quantidade = sc.nextInt();
		product.removerProdutos(quantidade);
		System.out.println("Dados atualizados: " + product);
		
		sc.close();
	}

}
