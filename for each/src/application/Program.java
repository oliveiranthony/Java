package application;

public class Program {

	public static void main(String[] args) {
		String[] vect = new String[] {"Maria", "Joao", "Bob"};

		for (int i = 0; i < vect.length; i++) { //for comum
			System.out.println(vect[i]);
		}
		
		System.out.println("-----------------");
		for (String nome: vect) { //for each
			System.out.println(nome);
		}
	}

}
