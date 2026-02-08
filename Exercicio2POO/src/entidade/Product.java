package entidade;

public class Product {

	public String nome;
	public double preco;
	public int quantidade;
	
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
		return nome + ", $" + String.format("%.2f", preco) + ", " + quantidade + " Unidades" + ", Total: $ " + valorTotalEmEstoque();
	}
}
