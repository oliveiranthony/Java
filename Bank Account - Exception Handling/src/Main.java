import model.entities.Account;
import model.exception.DomainException;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        try {
            System.out.println("Enter account data");
            System.out.print("Account number: ");
            int accountNumber = sc.nextInt();
            System.out.print("Holder name: ");
            sc.nextLine();
            String holderName = sc.nextLine();
            System.out.print("Initial balance: ");
            double initialBalance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();
            Account account = new Account(accountNumber, holderName, initialBalance, withdrawLimit);
            System.out.println();

            System.out.print("Enter amount for withdraw: ");
            double amount = sc.nextDouble();
            account.withdraw(amount);
            System.out.println("New balance: " + account.getBalance());
        } catch (IllegalArgumentException e){
            System.out.println("Invalid input");
        } catch (DomainException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }
        sc.close();
    }
}