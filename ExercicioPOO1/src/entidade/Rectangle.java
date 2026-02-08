package entidade;

public class Rectangle {

	public double Largura;
	public double Altura;
	
	public double Area() {
		return Largura * Altura;
	}
	
	public double Perimeter() {
		return 2 * (Largura + Altura);
	}
	
	public double Diagonal() {
		return Math.sqrt((Math.pow(Largura,2)) + (Math.pow(Altura,2)));
	}
}
