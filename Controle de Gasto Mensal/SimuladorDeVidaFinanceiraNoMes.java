import java.util.Locale;
import java.util.Scanner;

public class SimuladorDeVidaFinanceiraNoMes {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite o seu salario: R$");
        double salario = sc.nextDouble();
        System.out.println("Insira 0 para encerrar o programa.");
        double gasto = 0.00;
        double soma; 

        do {
            System.out.print("Digite o valor do seu gasto: R$");
            soma = sc.nextDouble();
            if (soma == 0) {
                System.out.println("Programa encerrado");
                break;
            }
            gasto += soma;
            if (gasto > salario) {
                System.out.println("Atencao!!!\nVoce ultrapassou o valor do seu salario.");
            } 
        } while (true);

        System.out.printf("Este mes voce gastou exatamente: R$%.2f\n", gasto);
        if (gasto > salario) {
            gasto -= salario;
            System.out.printf("O valor ultrapassado em relação ao seu salario foi de R$%.2f", gasto);
        }

        sc.close();
    }
}