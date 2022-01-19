package exercicios.ex41;

public class NaturalPerson extends Person{
    private Double healthExpenses;

    public NaturalPerson(){super();}

    public NaturalPerson(String name, Double annualIncome, Double healthExpenses) {
        super(name, annualIncome);
        this.healthExpenses = healthExpenses;
    }

    public double getHealthExpenses() {
        return healthExpenses;
    }

    @Override
    public double tax() {
        double tax = 0;
        if(getAnnualIncome() < 20000){
            tax = getAnnualIncome()* 0.15;
        }
        if (getAnnualIncome() > 20000){
            tax = getAnnualIncome()* 0.25;
        }
        if (healthExpenses > 0){
            tax -= getHealthExpenses()* 0.50;
        }

        return tax;
    }
}
