package entidade;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Funcionarios {
	Scanner sc = new Scanner(System.in);
	List<Funcionarios> funcionarios = new ArrayList<>();
	
	private String nomeFuncionario;
	private int id;
	private double salario;
	
	public Funcionarios(String nomeFuncionario, int id, double salario) {
		this.nomeFuncionario = nomeFuncionario;
		this.id = id;
		this.salario = salario;
	}
	
	public Funcionarios(double salario) {

		this.salario = salario;
	}


	public String getNomeFuncionario() {
		return nomeFuncionario;
	}
	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalario() {
		return salario;
	}
	
	public void aumentarSalario(double porcentagem) {
		this.salario += salario * porcentagem / 100;
	}

	
}
