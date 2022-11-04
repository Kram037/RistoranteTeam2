package customer;
import entities.FoodPreferences;

public class Customer {

    public String nominal;
    public FoodPreferences foodPreference;

    public Customer(String nominal, FoodPreferences foodPreference){
        this.nominal = nominal;
        this.foodPreference = foodPreference;
    }



}
