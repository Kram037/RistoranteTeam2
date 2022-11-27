package customer;
import enumerations.FoodPreferencesEnum;

/**
 * @author Alina Mustata
 * The class Customer
 */
public class Customer {

    private final String customerName;
    private final FoodPreferencesEnum foodPreference;

    /**
     * Instantiates a new Customer
     *
     * @param customerName   the customer name
     * @param foodPreference the food preference of the customer(VEGAN, VEGETARIAN, DEFAULT)
     */
    public Customer(String customerName, FoodPreferencesEnum foodPreference){
        this.customerName = customerName;
        this.foodPreference = foodPreference;
    }

    /**
     * Gets customer name
     *
     * @return the customer name
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Gets food preference of the customer
     *
     * @return the food preference
     */
    public FoodPreferencesEnum getFoodPreference() {
        return foodPreference;
    }

    /**
     * toString method to print the customer object details
     * @return the string values of the variables in the Customer object
     */
    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                ", foodPreference=" + foodPreference +
                '}';
    }
}
