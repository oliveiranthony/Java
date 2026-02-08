package entities; //Pacote da classe

public class Triangulo { //Nome da classe

	public double a;  // Atributos
	public double b;     // da
	public double c;   // classe    
	
	public double area(/*lista de parametro do metodo*/) {
		double p = (a + b + c) / 2.0;                        /*Corpo do*/
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));    /*metodo*/
	}
}
