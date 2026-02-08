package application;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.Duration;

public class program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite 1 para iniciar o cronometro de tempo para seus estudos: ");
		int inicio = sc.nextInt();
		while (inicio != 1) {
			System.out.print("Valor invalido, digite 1 para iniciar o cronometro: ");
			inicio = sc.nextInt();
		}
		LocalDateTime registroInicial = LocalDateTime.now();
		DateTimeFormatter registroFormatado = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		System.out.println("Cronometro Iniciado! "
				+ "Horario de inicio: " + registroFormatado.format(registroInicial));
		System.out.print("Apos finalizar seus estudos, digite 2 para encerrar o cronometro: ");
		int fim = sc.nextInt();
		while (fim != 2) {
			System.out.println("Valor invalido, digite 2 para finalizar a contagem: ");
			fim = sc.nextInt();
		} 
		LocalDateTime registroFinal = LocalDateTime.now();
		System.out.println("Horario de encerramento: " + registroFormatado.format(registroFinal));
		Duration inicioFim = Duration.between(registroInicial, registroFinal);
		System.out.println("O tempo de estudos foi de: " + inicioFim.toMinutes() + " Minutos");
		
		sc.close();
	}
}
