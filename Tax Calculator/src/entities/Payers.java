package entities;
//Uma classe abstrata é declarada com a palavra-chave abstract e não pode ser instanciada.
public abstract class Payers {
    private String name;
    private Double anualIncome;

    public Payers() {
    }
    public Payers(String name, Double anualIncome) {
        this.name = name;
        this.anualIncome = anualIncome;
    }

    public String getName() {
        return name;
    } public void setName(String name) {
        this.name = name;
    }
    public Double getAnualIncome() {
        return anualIncome;
    } public void setAnualIncome(Double anualIncome) {
        this.anualIncome = anualIncome;
    }

    /*
    Um método abstrato não tem corpo, só a assinatura.
    Ele obriga as subclasses a implementarem esse método.
     */
    public abstract double taxesPayable();
}
