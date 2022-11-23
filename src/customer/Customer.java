package customer;
import enumerations.FoodPreferencesEnum;

public class Customer {

    private final String customerName;
    private final FoodPreferencesEnum foodPreference;

    public Customer(String customerName, FoodPreferencesEnum foodPreference){
        this.customerName = customerName;
        this.foodPreference = foodPreference;
    }

    public String getCustomerName() {
        return customerName;
    }

    public FoodPreferencesEnum getFoodPreference() {
        return foodPreference;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                ", foodPreference=" + foodPreference +
                '}';
    }
}
