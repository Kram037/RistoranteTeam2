package entities;
import enumerations.DishTypeEnum;
import enumerations.FoodPreferencesEnum;

/**
 * The class that declare the SecondCourses.
 */
public class SecondCourses extends Dish {

    /**
     * The Dish type enum to declare the dish type (DRINK, APPETIZER, ETC..).
     */
    DishTypeEnum dishTypeEnum;

    /**
     * Instantiates a new Second courses.
     *
     * @param name        the name
     * @param ingredients the ingredients
     * @param price       the price
     * @param preference  the preference
     */
    public SecondCourses(String name, String ingredients, double price, FoodPreferencesEnum preference) {
        super(name, ingredients, price, preference);
        dishTypeEnum = DishTypeEnum.SECONDCOURSE;
    }

    @Override
    public DishTypeEnum getDishTypeEnum() {
        return dishTypeEnum;
    }
}