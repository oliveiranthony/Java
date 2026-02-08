import java.util.Locale;

public class variavel2 {

	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		String nome = "Maria";
		int idade = 42;
		double renda = 4.500;
		
		System.out.printf("%s,com %d anos de idade, tem uma renda de R$%.3f mensais", nome, idade, renda);
	}
}
