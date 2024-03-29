package it.restaurantSite.entities;

import it.restaurantSite.enumerations.DishTypeEnum;
import it.restaurantSite.enumerations.FoodPreferencesEnum;

/**
 * The class that declare the MainCourses.
 */
public class MainCourses extends Dish{

    /**
     * Instantiates a new Main courses.
     *
     * @param name        the name of the main courses.
     * @param ingredients the ingredients of the main courses.
     * @param price       the price of the main courses.
     * @param preference  the food preference of the it.restaurantSite.restaurant.customer.
     */
    public MainCourses(String name,String ingredients,double price,FoodPreferencesEnum preference){
        super(name,ingredients,price,preference);
        setDishTypeEnum(DishTypeEnum.MAIN_COURSE);
    }
}
