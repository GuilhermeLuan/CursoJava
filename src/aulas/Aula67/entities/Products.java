package aulas.Aula67.entities;

public class Products {
    // Atributos da classe
    public String name;
    public double price;
    public int quantity;

    //Metodo
    public double totalValueInSotck(){
        return price * quantity;
    }
    public void addProducts(int quantity){
        this.quantity += quantity;
    }
    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }
    //Sobreposição do metodo padrão do objeto, já que toda classe é um object
    public String toString(){
        return name
                + ", $"
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total $"
                + String.format("%.2f", totalValueInSotck());
    }
}
