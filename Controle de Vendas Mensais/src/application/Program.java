package application;
import Service.Vendas;
import java.util.Scanner;
import java.util.Locale;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		List<Vendas> vendas = new ArrayList<>();

		System.out.print("Insira a quantidade de dias do mes atual: ");
		int daysMounth = sc.nextInt();
		System.out.print("Quantidade de produtos em estoque: ");
		int productInStock = sc.nextInt();
		int[][] matriz = new int[daysMounth][productInStock];
		
		String nameProduct; int idProduct = 0; int quantity = 0; double priceProduct = 0;
		for (int i = 0; i < productInStock; i++) {
			sc.nextLine();
			System.out.print("Name Product: ");
			nameProduct = sc.nextLine();
			System.out.print("id Product: ");
			idProduct = sc.nextInt();
			System.out.print("Price Product: R$");
			priceProduct = sc.nextDouble();
			System.out.print("Quantity of " + nameProduct + " in stock: ");
			quantity = sc.nextInt();
			Vendas information = new Vendas(nameProduct,idProduct,quantity,priceProduct);
			vendas.add(information);
		}
		
		int opcao;
		do {
		System.out.print("Registro de venda:"
				+ "Insira o dia e o produto em estoque");
		int registroVendas = matriz[sc.nextInt()][sc.nextInt()];
		Vendas registroDeVendas = new Vendas(registroVendas, quantity);
		registroDeVendas.setQuantity(quantity, registroVendas);
		vendas.add(registroDeVendas);
		System.out.println("Para finalizar esta funcao, insira o valor 0;"
				+ "Caso deseje continuar os registros, digite 1.");
		opcao = sc.nextInt();
		} while (opcao != 0);
		
		System.out.print("Vendas por dia:");
		for (int[] vendasPorDia : matriz) {
			System.out.println("Digite o dia do mes: ");
			int dia = sc.nextInt();
				for (int[] product : matriz) {
					int produto = sc.nextInt();
						if(produto == idProduct) {
							List<Vendas> registro = vendas.collect(Collector.toList()).filter(produto -> sc.nextInt() == idProduct). findFirst().orElse(null);
						}
				}
		}
		sc.close();
	}

}
