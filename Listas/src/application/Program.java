package application;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Victor");
		list.add("Vetooor");
		list.add(2, "Anthony");
		
		System.out.println(list.size());
	
		
		for(String nomes: list) {
			System.out.println(nomes);
		}
		System.out.println("---------------------------");
		
		list.remove(0);
		list.removeIf(nomes -> nomes.charAt(0) == 'A');
		for(String nomes: list) {
			System.out.println(nomes);
		}
		System.out.println("---------------------------");
		
		System.out.println("Posicao da palavra Bob: " + list.indexOf("Bob"));
		System.out.println("Posicao da palavra Bob: " + list.indexOf("Maria")); //Programa retorna -1 caso não ache
		System.out.println("---------------------------");
		
		List<String> resultado = list.stream().filter(nomes -> nomes.charAt(0) == 'V').collect(Collectors.toList());
		for(String nomes: resultado) {
			System.out.println(nomes);
		} 
		System.out.println("---------------------------");
		
		String nome = list.stream().filter(nomes -> nomes.charAt(0) == 'M').findFirst().orElse(null);
		System.out.println(nome);
	}
}
