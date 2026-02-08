package Service;
import java.util.Scanner;

public class Vendas {
	Scanner sc = new Scanner(System.in);
	
	private String nameProduct;
	private int registroVendas;
	private int idProduct;
	private double priceProduct;
	private int quantity;
	private double invoicing;
	
	public Vendas(String nameProduct, int idProduct, int quantity, double priceProduct) {
		this.nameProduct = nameProduct;
		this.idProduct = idProduct;
		this.quantity = quantity;
		this.priceProduct = priceProduct;
	}

	public Vendas(String nameProduct, int registroVendas, int idProduct, double priceProduct, int quantity, double invoicing) {
		this.nameProduct = nameProduct;
		this.idProduct = idProduct;
		this.priceProduct = priceProduct;
		this.quantity = quantity;
		this.invoicing = invoicing;
		this.registroVendas = registroVendas;
	}

	public Vendas(int registroVendas, int quantity) {
		this.registroVendas = registroVendas;
		this.quantity = quantity;
	}

	public String getNameProduct() {
		return nameProduct;
	}

	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}
	

	public int getRegistroVendas() {
		return registroVendas;
	}

	public int getIdProduct() {
		return idProduct;
	}

	public void setidProduct(int idProduct) {
		this.idProduct = idProduct;
	}

	public double getPriceProduct() {
		return priceProduct;
	}

	public void setPriceProduct(double priceProduct) {
		this.priceProduct = priceProduct;
	}

	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity, int registroVendas) {
		quantity -= registroVendas;
	}

	public double getInvoicing() {
		return invoicing;
	}
	
}
