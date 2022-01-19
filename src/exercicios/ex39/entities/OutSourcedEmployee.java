package exercicios.ex39.entities;

public class OutSourcedEmployee extends Employee {
    private Double addicionalCharger;

    public OutSourcedEmployee(){
        super();
    }

    public OutSourcedEmployee(String name, Integer hours, double valuePerHour, Double addicionalCharger) {
        super(name, hours, valuePerHour);
        this.addicionalCharger = addicionalCharger;
    }

    public Double getAddicionalCharger() {
        return addicionalCharger;
    }

    public void setAddicionalCharger(Double addicionalCharger) {
        this.addicionalCharger = addicionalCharger;
    }

    @Override
    public final double payment(){
        return super.payment() + 1.1 * addicionalCharger;
    }
}
