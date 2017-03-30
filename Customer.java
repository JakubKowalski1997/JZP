/**
 * Created by Lenovo on 2017-03-30.
 */
public class Customer {
    private String firstName;
    private String surName;
    private String placeOfResidence;
    public Customer(String firstName,String surName,String placeOfResidence)
    {
        this.firstName = firstName;
        this.surName = surName;
        this.placeOfResidence = placeOfResidence;
    }

    public void givingOrder() {

        System.out.println("The order has ben given propely");
    }

}
