package entities;
import java.text.DecimalFormat;

public class ImportedProduct extends Product {
    DecimalFormat df = new DecimalFormat("0.00");

    private Double customsFee;

    public ImportedProduct() {
        super();
    }
    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    @Override
    public String priceTag() {
        return super.getName()
                + " $ " + df.format(totalPrice())
                + " (Customs fee: " + df.format(customsFee) + ")";
    }

    public double totalPrice() {
        return super.getPrice() + customsFee;
    }
}
