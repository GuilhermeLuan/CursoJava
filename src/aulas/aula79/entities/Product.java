package aulas.aula79.entities;

public class Product {
    private String name;
    private double price;
    private int quatity;

    //Costrutor
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    //Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuatity() {
        return quatity;
    }

    //Metodo
    public double totalValueInStock(){
        return quatity * price;
    }
    public void addProducts(int add){
        quatity += add;
    }
    public void removeProducts(int remove){
        quatity -= remove;
    }
    public String toString(){
        return name
                + ", $"
                + String.format("%.2f", price)
                + ", "
                + quatity
                + " units, Total $"
                + String.format("%.2f", totalValueInStock());
    }
}
