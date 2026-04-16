package entities;
import entities.enums.OrderStatus;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;
import java.time.format.DateTimeFormatter;

public class Order {
    DecimalFormat df = new DecimalFormat("0.00");
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

    private LocalDateTime moment;
    private OrderStatus status;

    private Client client;

    private List<OrderItem> orderList = new ArrayList<>();

    public Order() {
    }
    public Order(LocalDateTime moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public LocalDateTime getMoment() {
        return moment;
    } public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }
    public OrderStatus getStatus() {
        return status;
    } public void setStatus(OrderStatus status) {
        this.status = status;
    }
    public Client getClient() {
        return client;
    } public void setClient(Client client) {
        this.client = client;
    }
    public List<OrderItem> getOrderList() {
        return orderList;
    }

    public void addItem(OrderItem orderItem) {
        orderList.add(orderItem);
    }
    public void removeItem(OrderItem orderItem) {
        orderList.remove(orderItem);
    }

    public Double totalPrice() {
        double sum = 0.0;
        for(OrderItem ordItem : orderList) {
            sum += ordItem.subTotal();
        }
        return sum;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ORDER SUMMARY: \n");
        sb.append("Order momment: " +  dtf.format(moment) + "\n");
        sb.append("Order status: " + status + "\n");
        sb.append("Client: " + client + "\n");
        sb.append("Order items: \n");
        for(OrderItem ordItem : orderList) {
            sb.append(ordItem + "\n");
        }
        sb.append("Total Price: $" + df.format(totalPrice()));
        return sb.toString();
    }
}
