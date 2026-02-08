package util;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	public static final double DOLAR = 5.52;
	
	public static double precoDolar(double compra) {
		return compra * DOLAR * IOF;
	}
	
	public static double total(double compra) {
		return compra * DOLAR + precoDolar(compra);
	}
}
