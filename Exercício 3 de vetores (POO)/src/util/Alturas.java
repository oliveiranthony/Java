package util;

public class Alturas {

	private String nomes;
	private int idade;
	private double altura;
	public Alturas(String nomes, int idade, double altura) {
		this.nomes = nomes;
		this.idade = idade;
		this.altura = altura;	
	}
	
	public String getNomes() {
		return nomes;
	}
	public void setNomes(String nomes) {
		this.nomes = nomes;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
}
