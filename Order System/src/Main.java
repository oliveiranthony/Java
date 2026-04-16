import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;
//----------------------------------------
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        //Cadastro de informações do cliente
        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (dd/MM/yyyy): ");
        Date birthDate = sdf.parse(sc.nextLine());
        Client client = new Client(name, email, birthDate);
        System.out.println();

        //Status do pedido (Data-hora && Status)
        System.out.println("Enter order data:");
        LocalDateTime moment = LocalDateTime.now();
        System.out.print("Status: ");
        OrderStatus orderStatus = OrderStatus.valueOf(sc.nextLine());
        Order order = new Order(moment, orderStatus, client);
        System.out.println();

        //Informações da venda
        System.out.print("How many items to this order? ");
        int items = sc.nextInt();
        for(int i = 1; i <= items; i++) {
            sc.nextLine();
            System.out.println("Enter #" + i + " item data: ");
            System.out.print("Product name: ");
            String productName = sc.nextLine();
            System.out.print("Product price: $");
            double productPrice = sc.nextDouble();
            System.out.print("Product quantity: ");
            int productQuantity = sc.nextInt();
            System.out.println();
            Product product = new Product(productName, productPrice); //
            OrderItem orderItem = new OrderItem(productQuantity, productPrice, product);
            order.addItem(orderItem);
        }

        //Final Informations
        System.out.println(order);
        sc.close();
    }
}