package aulas.aula78.entities;

public class Product {
    public String name;
    public double price;
    public int quatity;

    //construtor padrão
    public Product(){}

    //construtor personalizado
    public Product(String name, double price, int quatity){
        //this -> referencia para o proprio objeto
        this.name = name;
        this.price = price;
        this.quatity = quatity;
    }
    public Product(String name, double price){
        //this -> referencia para o proprio objeto
        this.name = name;
        this.price = price;
    }

    //metodo
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
