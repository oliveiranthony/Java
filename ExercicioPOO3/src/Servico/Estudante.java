package Servico;

public class Estudante {
	public String Aluno;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double notaTotal() {
		return nota1 + nota2 + nota3;
	}
	
	public double pontosRestantes() {
		return 60 - notaTotal();
	}
}
