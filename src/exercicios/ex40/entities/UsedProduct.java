package exercicios.ex40.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
    private Date manufactureDate;

    final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");

    public UsedProduct(){super();}

    public UsedProduct(String name, double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag() {

        return getName() + " (used) " + "$ " + getPrice() + " (Manufacture data:" + sdf.format(manufactureDate) + ")";
    }
}
