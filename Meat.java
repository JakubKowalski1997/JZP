/**
 * Created by Lenovo on 2017-03-30.
 */
public class Meat extends Product{
    private String typeOfMeat;
    private boolean isFresh;

    public Meat(String name, double price, String typeOfMeat, boolean isFresh ) {
        super(name,price);
        this.typeOfMeat = typeOfMeat;
        this.isFresh = isFresh;
    }
}
