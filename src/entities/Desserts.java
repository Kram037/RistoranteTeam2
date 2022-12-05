package entities;
import enumerations.DishTypeEnum;
import enumerations.FoodPreferencesEnum;

/**
 * The class that declare the Desserts.
 */
public class Desserts extends Dish{

    /**
     * The Dish type enum to declare the dish type (DRINK, APPETIZER, ETC..).
     */
    DishTypeEnum dishTypeEnum;

    /**
     * Instantiates a new Desserts.
     *
     * @param name        the name of the dessert.
     * @param ingredients the ingredients of the dessert.
     * @param price       the price of the dessert.
     * @param preference  the food preference of the customer.
     */
    public Desserts(String name, String ingredients, double price, FoodPreferencesEnum preference) {
        super(name, ingredients, price, preference);
        dishTypeEnum = DishTypeEnum.DESSERT;
    }

    /**
     * Function for retrieving the DishTypeEnum.
     * @return dishTypeEnum
     */
    @Override
    public DishTypeEnum getDishTypeEnum() {
        return dishTypeEnum;
    }
}
