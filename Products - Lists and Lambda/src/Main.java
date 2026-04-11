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
            System.out.print("Quantidade disponivel: ");
            int quantDisponivel = sc.nextInt();
            if (quantDisponivel < 0) {
                do {
                    System.out.println("""
                        Não é possivel registrar essa quantidade.
                        Por favor, registre a quantidade novamente:
                        """);
                    System.out.print("Quantidade: ");
                    quantDisponivel = sc.nextInt();
                } while (quantDisponivel < 0);
            }
            Products product = new Products(name, price, quantDisponivel);
            list.add(product);
            System.out.println();
        }

        System.out.print("Exibir produtos que estão acima de: R$ ");
        double maioresPrecos = sc.nextDouble();
        List<Products> products = list.stream()
                .filter(x -> x.getPrice() > maioresPrecos)
                .collect(Collectors.toList());
        for(Products produtos : products) {
            System.out.println(produtos.getName()
                    + ", Preço: R$ " + df.format(produtos.getPrice()) + ", "
                    + "Quantidade disponível: "
                    + produtos.getQuantDisponivel());
        }
        sc.nextLine();
        System.out.println();

        System.out.print("Busque o produto pelo nome: ");
        String nome = sc.nextLine();
        Products buscaNome = list.stream()
                .filter(x -> x.getName().equals(nome))
                .findFirst().orElse(null);
        if(buscaNome != null) {
            System.out.println("Produto: " + buscaNome.getName() + ", R$ " + df.format(buscaNome.getPrice()));
        } else {
            System.out.println("Produto não encontrado.");
        }
        System.out.println();

        List<Products> disponiveis = list.stream()
                .filter(x -> x.getQuantDisponivel() > 0)
                .collect(Collectors.toList());
        System.out.println("Produtos Disponiveis para venda:");
        for(Products pDisponiveis : disponiveis) {
            System.out.println("Produto: " + pDisponiveis.getName()
                    + ", R$ " + df.format(pDisponiveis.getPrice())
                    + " Quantidade Disponivel: "
                    + pDisponiveis.getQuantDisponivel());
        }

        sc.close();
    }
}