package Servico;

public class Funcionario {

	public String nome;
	public double salarioBruto;
	public double taxa;
	
	public double salarioLiquido() {
		return salarioBruto - taxa;
	}
	
	public void taxaDeAumento(double percentual) {
		salarioBruto += salarioBruto * percentual;
	}
}
