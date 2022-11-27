package customer;
import enumerations.FoodPreferencesEnum;

/**
 * The class that declare the Customer.
 */
public class Customer {

    /**
     * The customer name used to reserve a table in the restaurant.
     */
    public String nominal;
    /**
     * The Food preference of the customer for choosing the menu type.
     */
    public FoodPreferencesEnum foodPreference;

    /**
     * Instantiates a new Customer.
     *
     * @param nominal        the name of the customer.
     * @param foodPreference the food preference of the customer.
     */
    public Customer(String nominal, FoodPreferencesEnum foodPreference){
        this.nominal = nominal;
        this.foodPreference = foodPreference;
    }

    public String getCustomerName() {
        return "string";
    }
}
