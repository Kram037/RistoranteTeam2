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
     * @param name        the name
     * @param ingredients the ingredients
     * @param price       the price
     * @param preference  the preference
     */
    public Drinks(String name, String ingredients, double price, FoodPreferencesEnum preference) {
        super(name, ingredients, price, preference);
        dishTypeEnum = DishTypeEnum.DRINK;
    }

    @Override
    public DishTypeEnum getDishTypeEnum() {
        return dishTypeEnum;
    }
}
