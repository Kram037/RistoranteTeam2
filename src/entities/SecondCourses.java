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
     * @param name        the name of the second courses.
     * @param ingredients the ingredients of the second courses.
     * @param price       the price of the second courses.
     * @param preference  the food preference of the customer.
     */
    public SecondCourses(String name, String ingredients, double price, FoodPreferencesEnum preference) {
        super(name, ingredients, price, preference);
        dishTypeEnum = DishTypeEnum.SECONDCOURSE;
    }

    /**
     * Function for retrieving the DishTypeEnum.
     *
     * @return dishTypeEnum
     */
    @Override
    public DishTypeEnum getDishTypeEnum() {
        return dishTypeEnum;
    }
}