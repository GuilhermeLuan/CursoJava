package exercicios.ex41;

public class LegalPerson extends Person {
    private Integer employees;

    public LegalPerson(){super();}

    public LegalPerson(String name, double annualIncome, Integer employees) {
        super(name, annualIncome);
        this.employees = employees;
    }

    public Integer getEmployees() {
        return employees;
    }

    @Override
    public double tax() {
        double tax = 0;

        if(employees > 10){
            tax = getAnnualIncome() * 0.14;
        }
        else {
            tax = getAnnualIncome() * 0.16;
        }

        return tax;
    }
}
