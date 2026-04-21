package entities;

public class Company extends Payers{
    private Integer employees;

    public Company() {
        super();
    }
    public Company(String name, Double anualIncome, Integer employees) {
        super(name, anualIncome);
        this.employees = employees;
    }

    public Integer getEmployees() {
        return employees;
    } public void setEmployees(Integer employees) {
        this.employees = employees;
    }

    @Override
    public double taxesPayable() {
        double taxesPayable = 0.0;
        if(employees > 10) {
            taxesPayable = super.getAnualIncome();
            taxesPayable *= 0.14;
        } else {
            taxesPayable = super.getAnualIncome();
            taxesPayable *= 0.16;
        }
        return taxesPayable;
    }
}
