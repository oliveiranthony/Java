package entidade;

public class contaBancaria {
	private int numeroConta;
	private String titular;
	private double saldo;
	private double deposito;
	private double saque;
	
	public contaBancaria(int numeroConta, String titular, double saldo, double deposito, double saque) {
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.saldo = saldo;
		this.deposito = deposito;
		this.saque = saque;
	}

	public int getNumeroConta() {
		return numeroConta;
	}
	
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public double getDeposito() {
		return deposito;
	}
	
	public void setDeposito(double deposito) {
		this.saldo += deposito;
	}
	
	public double getSaque() {
		return saque;
	}

	public void setSaque(double saque) {
		this.saldo -= saque;
	} 
	
	public String valorDeposito() {
		return "Dados atualizados: "
			    + " Conta: " + numeroConta 
			    + ", Titular: " + titular 
			    + ", Saldo: R$" + saldo;		
	}
	
	public String valorSaque() {
		return "Dados atualizados: "
			    + "Conta: " + numeroConta 
			    + ", Titular: " + titular 
			    + ", Saldo: R$" + saldo;		
	}
}
