package entidade;

public class MaiorNumero {
	private int n;
	private double nMaior;
	public MaiorNumero(int n, double nMaior) {
		this.n = n;
		this.nMaior = nMaior;
	}
	
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public double getnMaior() {
		return nMaior;
	}
	public void setnMaior(double nMaior) {
		this.nMaior = nMaior;
	}
	
}
