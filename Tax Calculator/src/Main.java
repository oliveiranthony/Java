import entities.Company;
import entities.Individual;
import entities.Payers;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        DecimalFormat df = new DecimalFormat("0.00");

        List<Payers> list = new ArrayList<>();

        System.out.print("Enter the number of tax payer: ");
        int n = sc.nextInt();
        for(int i = 1 ; i <= n; i++) {
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Anual Income: ");
            double anualIncome = sc.nextDouble();
            if(ch == 'i') {
                System.out.print("Health expenditures: ");
                double heathExp = sc.nextDouble();
                Payers payers = new Individual(name, anualIncome, heathExp);
                list.add(payers);
            } else if(ch == 'c') {
                System.out.print("Number of employees: ");
                int nEmployees = sc.nextInt();
                Payers payers = new Company(name, anualIncome, nEmployees);
                list.add(payers);
            }
        }
        System.out.println();
        System.out.println("TAXES PAID:");
        for(Payers payer : list) {
            System.out.println(payer.getName() + ": $ " + df.format(payer.taxesPayable()));
        }
        System.out.println();
        System.out.println("TOTAL TAXES:");
        double sum = 0.0;
        for(Payers payer : list) {
            sum += payer.taxesPayable();
        }
        System.out.println("TOTAL TAXES: $" + df.format(sum));

        sc.close();
    }
}