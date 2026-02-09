package application;
import Service.SistemaLogin; 
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		SistemaLogin sistema = new SistemaLogin();
		String login;
		int senhaDigitada;
		
		System.out.println(sistema.toString());
		System.out.print("Digite a senha: ");
		senhaDigitada = sc.nextInt();
		System.out.println(sistema.autenticar(senhaDigitada));
			
		sc.close();
	}
}
