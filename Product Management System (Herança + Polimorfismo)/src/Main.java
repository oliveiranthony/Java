import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;
//--------------------------
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Locale;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            sc.nextLine();
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported (c/u/i): ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            if(ch == 'c') {
                Product product = new Product(name, price);
                list.add(product);
            } else if(ch == 'u') {
                System.out.print("Manufacture date (dd/MM/YYYY): ");
                sc.nextLine();
                String manufactureDate = sc.nextLine();
                Product product = new UsedProduct(name, price, sdf.parse(manufactureDate));
                list.add(product);
            } else if(ch == 'i') {
                System.out.print("Custom fee: ");
                double customsFee = sc.nextDouble();
                Product product = new ImportedProduct(name, price, customsFee);
                list.add(product);
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS: ");
        for(Product p : list) {
            System.out.println(p.priceTag());
        }

        sc.close();
    }
}