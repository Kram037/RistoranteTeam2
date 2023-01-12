package it.restaurantSite.customer;
import it.restaurantSite.enumerations.FoodPreferencesEnum;

/**
 * The class that declare the Customer.
 */
public class Customer {

    private  String customerName;
    private FoodPreferencesEnum foodPreference;

    /**
     * Instantiates a new Customer
     * @param customerName   the it.restaurantSite.restaurant.customer name
     * @param foodPreference the food preference of the it.restaurantSite.restaurant.customer(VEGAN, VEGETARIAN, DEFAULT)
     */
    public Customer(String customerName, FoodPreferencesEnum foodPreference){
        this.customerName = customerName;
        this.foodPreference = foodPreference;
    }

    /**
     * Gets it.restaurantSite.restaurant.customer name
     * @return the it.restaurantSite.restaurant.customer name
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Gets food preference of the it.restaurantSite.restaurant.customer
     * @return the food preference
     */
    public FoodPreferencesEnum getFoodPreference() {
        return foodPreference;
    }

    /**
     * Print info it.restaurantSite.restaurant.customer.
     */
    public void infoCustomer(){
        System.out.println("Customer name: " + customerName + " Food preference: " + foodPreference);
    }

    /**
     * toString method to print the it.restaurantSite.restaurant.customer object details
     * @return the string values of the variables in the Customer object
     */
    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName +
                ", foodPreference=" + foodPreference +
                '}';
    }


}
