package application;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class program {
	public static void main(String[] args) {
		
		// https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/time/format/DateTimeFormatter.html
		
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		// Agora
		LocalDate date01 = LocalDate.now();
		LocalDateTime dateTime = LocalDateTime.now();
		Instant date02 = Instant.now();
		
		// Padrão ISO 8601
		LocalDate date03  = LocalDate.parse("2026-01-31");
		LocalDateTime date04 = LocalDateTime.parse("2026-01-31T18:00:26");
		Instant date05 = Instant.parse("2026-01-31T18:00:26Z");
		Instant date06 = Instant.parse("2026-01-31T18:00:26-03:00");
		
		// Texto com formato personalizado
		LocalDate date07 = LocalDate.parse("01/02/2026", formatter1);
		LocalDateTime date08 = LocalDateTime.parse("01/02/2026 01:30", formatter2);
		
		
		// Ano, mes, dia isolados
		LocalDate date09 = LocalDate.of(2026, 3, 28);
		LocalDateTime date10 = LocalDateTime.of(2026, 7, 29, 16, 30);

		System.out.println(date01.toString());
		System.out.println(dateTime.toString());
		System.out.println(date02.toString());
		System.out.println(date03.toString());
		System.out.println(date04.toString());
		System.out.println(date05.toString());
		System.out.println(date06.toString());
		System.out.println(date07.toString());
		System.out.println(date08.toString());
		System.out.println(date09.toString());
		System.out.println(date10.toString());

	}
}
