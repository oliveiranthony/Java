import entities.Products;
import java.util.Scanner;
import java.util.Locale;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        DecimalFormat df = new DecimalFormat("#0.00");
        List<Products> list = new ArrayList<>();

        System.out.println(""" 
                Cada produto deve conter Nome e Preço.
                O programa retornará os produtos que estiverem acima do preço informado posteriormente.
                Em seguida, poderá buscar o produto pelo nome, mostrando à frente o seu devido preço.
                """);
        System.out.print("Informe a quantidade total de produtos: ");
        int nProdutos = sc.nextInt();
        for (int i = 1; i <= nProdutos; i++) {
            sc.nextLine();
            System.out.print("Insira o nome do produto: ");
            String name = sc.nextLine();
            System.out.print("Informe o valor do produto: R$ ");
            double price = sc.nextDouble();
            list.add(new Products(name, price));
            Products product = new Products(name, price);
            System.out.println();
        }

        System.out.print("Exibir produtos que estão acima de: R$ ");
        double maioresPrecos = sc.nextDouble();
        List<Products> products = list.stream()
                .filter(x -> x.getPrice() > maioresPrecos)
                .collect(Collectors.toList());
        for(Products produtos : products) {
            System.out.println(produtos.getName() + ", Preço: R$ " + df.format(produtos.getPrice()));
        }
        sc.nextLine();
        System.out.println();

        System.out.println("Busque o produto pelo nome:");
        String nome = sc.nextLine();
        Products busca = list.stream()
                .filter(x -> x.getName().equals(nome))
                .findFirst().orElse(null);
        if(busca != null) {
            System.out.println("Produto: " + busca.getName() + ", R$ " + df.format(busca.getPrice()));
        }

        sc.close();
    }
}