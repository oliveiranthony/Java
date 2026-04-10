package application;
import entidade.Funcionarios;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Locale;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		List<Funcionarios> funcionarios = new ArrayList<>();
		
		System.out.print("Quantos funcionarios serao registrados ? ");
		Integer n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
		System.out.println("Funcionario #" + (i + 1));
		System.out.print("ID do funcionario: ");
		int id = (sc.nextInt());
		System.out.print("Nome do funcionario: ");
		sc.nextLine();
		String nomeFuncionario =(sc.nextLine());
		System.out.print("Salario do  funcionario: R$");
		double salario = (sc.nextDouble());
		funcionarios.add(new Funcionarios(nomeFuncionario, id, salario));
		System.out.println();
		}
		
		System.out.print("Insira o id do funcionario que recebera o aumento de salario: ");
		int ID = sc.nextInt();
		Funcionarios func = funcionarios.stream().filter(x -> x.getId() == ID).findFirst().orElse(null);
			if (func == null) {
				System.out.println("Este ID nao corresponde a um funcionario");
			} else {
				System.out.print("Insira a porcentagem de aumento: ");
				double porcentagem = sc.nextDouble();
				func.aumentarSalario(porcentagem);
			} 
		System.out.println();
		
		System.out.println("Lista de funcionarios: ");
		for(Funcionarios infos: funcionarios) {
			System.out.println(infos.getId() + ", " 
							   + infos.getNomeFuncionario() + ", " 
							   + infos.getSalario());
		}
		
		sc.close();
	}

}