import java.util.Locale;
import java.util.Scanner;

public class VitalTrack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

         /*IMPORTANTE:
           Essas fórmulas são estimativas. Para resultados precisos e personalizados, consulte um nutricionista ou médico. 
         */

        System.out.println("---Selecione uma opcao---");
        System.out.println("1 - Litros de agua por peso");
        System.out.println("2 - Taxa Metabolica Basal + Gasto Energetico Total + Objetivo");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("Digite o seu peso: ");
                int peso = sc.nextInt();
                double ml = 35;
                double totalML = peso * ml;
                double totalEmLitro = totalML / 1000;
                System.out.printf("Voce precisa beber %.2f litros de agua por dia", totalEmLitro);
                break;

            case 2:
                    System.out.print("Digite o seu peso: ");
                    peso = sc.nextInt();
                    System.out.print("Digite sua altura: ");
                    double altura = sc.nextDouble();
                    double alturaEmCentimetro = altura * 100;
                    System.out.print("Digite sua idade: ");
                    int idade = sc.nextInt();
                    System.out.println("Digite 0 se for Homem e 1 se for Mulher");
                    int sexo = sc.nextInt();
                    double TMB = 0;
                    while (sexo != 0 && sexo != 1) {
                        System.out.println("Valor invalido");
                        sexo = sc.nextInt();
                    }
                        if (sexo == 0) {
                        TMB = (10 * peso) + (6.25 * alturaEmCentimetro) - (5 * idade) + 5;
                        } else if (sexo == 1) {
                        TMB = (10 * peso) + (6.25 * alturaEmCentimetro) - (5 * idade) - 161;
                        } 
                    
                    System.out.printf("Sua Taxa Metabolica Basal = %.2f\n", TMB);
                    
                    int FAF;
                    System.out.println("Determine seu Fator de Atividade Física (FAF)");
                    System.out.println("1 - Sedentário (Pouco ou nenhum esforco fisico)" );
                    System.out.println("2 - Levemente Ativo (exercício leve 1-3x/semana)");
                    System.out.println("3 - Moderadamente Ativo (exercício moderado 3-5x/semana)");
                    System.out.println("4 - Muito Ativo (exercício intenso 6-7x/semana)");
                    System.out.println("5 - Extremamente Ativo (trabalho físico pesado/diário)");
                    FAF = sc.nextInt();

                    switch (FAF) {
                        case 1:
                            double GET;
                            GET = TMB * 1.2;
                            System.out.println("Seu Gasto Energetico Total (GET) = " + GET);
                            break;

                        case 2:
                            GET = TMB * 1.375;
                            System.out.println("Seu Gasto Energetico Total (GET) = " + GET);
                            break;

                        case 3:
                            GET = TMB * 1.55;
                            System.out.println("Seu Gasto Energetico Total (GET) = " + GET);
                            break;

                        case 4:
                            GET = TMB * 1.725;
                            System.out.println("Seu Gasto Energetico Total (GET) = " + GET);
                            break;

                        case 5:
                            GET = TMB * 1.9;
                            System.out.println("Seu Gasto Energetico Total (GET) = " + GET);
                            break;

                        default:
                            System.out.println("Opcao invalida");
                    }
                    
                    int objetivo;
                    System.out.println("Defina o seu objetivo:");
                    System.out.println("1 - Manter Peso");
                    System.out.println("2 - Perder peso");
                    System.out.println("3 - Obter massa muscular");
                    objetivo = sc.nextInt();

                    switch (objetivo) {
                        case 1:
                            System.out.println("Para manter o peso, basta manter a mesma quantidade de Gasto Energetico.");
                            break;

                        case 2:
                            System.out.println("Para obter a perda de peso, consuma menos caloria que seu Gasto Energetico Total.");
                            break;

                        case 3:
                            System.out.println("Para obter um ganho de Massa muscular consuma mais calorias que o GET.");
                            break;

                        default:
                            System.out.println("Opcao invalida");
                    }   

        }
        sc.close();
    }

}
