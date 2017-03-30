/**
 * Created by Lenovo on 2017-03-30.
 */
public class Main {
    public static void main(String[] args) {
        Customer client = new Customer("Adam", "Kowalski","Połaniec");

        Basket basket = new Basket();

        Product product1 = new Meat("Jagnięcina",20,"Skrzydełka",true);
        basket.addToBasket(product1.getName(), product1.getPrice());

        basket.showBasket();

        Order order = new Order(basket);

        client.givingOrder();
    }
}
