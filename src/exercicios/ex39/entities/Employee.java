package exercicios.ex39.entities;

public class Employee {
    private String name;
    private Integer hours;
    private double valuePerHour;

    public Employee(){}

    public Employee(String name, Integer hours, double valuePerHour) {
        this.name = name;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHours() {
        return hours;
    }

    public double getValuePerHour() {
        return valuePerHour;
    }

    public double payment(){
        return hours * valuePerHour;
    }

    @Override
    public String toString(){
        return name + " - " + String.format("$ %.2f", payment());
    }
}
