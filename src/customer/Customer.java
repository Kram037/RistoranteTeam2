package customer;
import enumerations.FoodPreferencesEnum;

/**
 * The class that declare the Customer.
 */
public class Customer {

    /**
     * The customer name used for reservation.
     */
    public String nominal;
    /**
     * The Food preference of the customer for choosing the menu type.
     */
    public FoodPreferencesEnum foodPreference;

    /**
     * Instantiates a new Customer.
     *
     * @param nominal        the nominal
     * @param foodPreference the food preference
     */
    public Customer(String nominal, FoodPreferencesEnum foodPreference){
        this.nominal = nominal;
        this.foodPreference = foodPreference;
    }

}
