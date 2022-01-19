package exercicios.ex40.entities;

public class ImportedProduct extends Product{
    private Double customsFree;

    ImportedProduct(){super();}

    public ImportedProduct(String name, double price, Double customsFree) {
        super(name, price);
        this.customsFree = customsFree;
    }

    public Double totalPrice(){
        return getPrice() + customsFree;
    }

    @Override
    public String priceTag(){
        return getName() + " $ " + totalPrice() + " (Customs fee:" + customsFree + ")" ;
    }
}
