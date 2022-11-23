package entities;
import enumerations.DishTypeEnum;
import enumerations.FoodPreferencesEnum;

/**
 * The class that declare the MainCourses.
 */
public class MainCourses extends Dish{

    /**
     * The Dish type enum to declare the dish type (DRINK, APPETIZER, ETC..).
     */
    DishTypeEnum dishTypeEnum;

    /**
     * Instantiates a new Main courses.
     *
     * @param name        the name
     * @param ingredients the ingredients
     * @param price       the price
     * @param preference  the preference
     */
    public MainCourses(String name, String ingredients, double price, FoodPreferencesEnum preference) {
        super(name, ingredients, price, preference);
        dishTypeEnum = DishTypeEnum.MAINCOURSE;
    }

    @Override
    public DishTypeEnum getDishTypeEnum() {
        return dishTypeEnum;
    }
}
