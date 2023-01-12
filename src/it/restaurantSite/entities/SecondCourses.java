package it.restaurantSite.entities;
import it.restaurantSite.enumerations.DishTypeEnum;
import it.restaurantSite.enumerations.FoodPreferencesEnum;

/**
 * The class that declare the SecondCourses.
 */
public class SecondCourses extends Dish {
    /**
     * Instantiates a new Second courses.
     *
     * @param name        the name of the second courses.
     * @param ingredients the ingredients of the second courses.
     * @param price       the price of the second courses.
     * @param preference  the food preference of the it.restaurantSite.restaurant.customer.
     */
    public SecondCourses(String name,String ingredients,double price,FoodPreferencesEnum preference){
        super(name,ingredients,price,preference);
        setDishTypeEnum(DishTypeEnum.SECOND_COURSE);
    }
}