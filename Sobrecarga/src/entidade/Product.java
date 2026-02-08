package entidade;

public class Product {

	public String nome;
	public double preco;
	public int quantidade;
	
	//Construtor:
	public Product(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		quantidade = quantidade;
	}
	
	//Sobrecarga
	public Product(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = 0; //Pode ser iniciada com 0, porém o Java inicia numeros de objetos a Arrays inicia com valor 0
	}
	
	public double valorTotalEmEstoque() {
		return preco * quantidade;
	}
	
	public void addAoEstoque(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void removerProdutos(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	public String toString() {
		return nome 
				+ ", $" 
				+ String.format("%.2f", preco) 
				+ ", " 
				+ quantidade 
				+ " Unidades" 
				+ ", Total: $ " 
				+ valorTotalEmEstoque();
	}
}
