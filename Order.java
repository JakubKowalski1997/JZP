/**
 * Created by Lenovo on 2017-03-30.
 */
public class Order {
    private double orderValue;
    public Order (Basket basket)
    {
        orderValue = basket.getTotalValue();
    }
}
