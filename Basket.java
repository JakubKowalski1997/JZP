import java.util.ArrayList;
import java.util.List;
public class Basket {
    private List<Product> productList;
    private double totalValue;
    public Basket()
    {
        productList = new ArrayList<>();
    }

    public void addToBasket(String name,double price)
    {
        productList.add(new Product(name,price));
        totalValue += price;
    }
    public void showBasket() {
        for (Product product : productList) {
            System.out.println("Produkt: " + product.getName());
            System.out.println("Cena: " + product.getPrice());
        }
        System.out.println();
        System.out.println("Wartość zamówienia: " + getTotalValue());
    }

    public void deleteAllProductsFromBasket() {
        productList.clear();
    }

    public double getTotalValue() {
        return totalValue;
    }
}
