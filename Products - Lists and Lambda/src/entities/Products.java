package entities;

public class Products {
    private String name;
    private double price;
    private int quantDisponivel;

    public Products(String name, double price, int quantDisponivel) {
        this.name = name;
        this.price = price;
        this.quantDisponivel = quantDisponivel;
    }

    public String getName() {
        return name;
    } public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantDisponivel() {
        return quantDisponivel;
    }
}
