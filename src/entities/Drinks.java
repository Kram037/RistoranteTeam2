package entities;
import enumerations.DishTypeEnum;
import enumerations.FoodPreferencesEnum;

/**
 * The class that declare the Drinks.
 */
public class Drinks extends Dish{

    /**
     * The Dish type enum to declare the dish type (DRINK, APPETIZER, ETC..).
     */
    DishTypeEnum dishTypeEnum;

    /**
     * Instantiates a new Drinks.
     *
     * @param name        the name of the drinks.
     * @param ingredients the ingredients of the drinks.
     * @param price       the price of the drinks.
     * @param preference  the food preference of the customer.
     */
    public Drinks(String name, String ingredients, double price, FoodPreferencesEnum preference) {
        super(name, ingredients, price, preference);
        dishTypeEnum = DishTypeEnum.DRINK;
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
