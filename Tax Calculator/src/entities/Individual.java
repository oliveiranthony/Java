package entities;

public class Individual extends Payers{
    private Double healthExpenditures;

    public Individual() {
        super();
    }
    public Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    } public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double taxesPayable() {
        double taxesPayable = 0.0;
        if (super.getAnualIncome() < 20000.00) {
            taxesPayable = super.getAnualIncome();
            taxesPayable *= 0.15;
            taxesPayable = taxesPayable - healthExpenditures * 0.5;
        } else {
            taxesPayable = super.getAnualIncome();
            taxesPayable *= 0.25;
            taxesPayable = taxesPayable - healthExpenditures * 0.5;
        }
        return taxesPayable;
    }
}
