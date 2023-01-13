package it.restaurantSite.entities;
import it.restaurantSite.enumerations.DishTypeEnum;
import it.restaurantSite.enumerations.FoodPreferencesEnum;

/**
 * The class that declare the Drinks.
 */
public class Drinks extends Dish{

    /**
     * Instantiates a new Drinks.
     *
     * @param name        the name of the drinks.
     * @param ingredients the ingredients of the drinks.
     * @param price       the price of the drinks.
     * @param preference  the food preference of the it.restaurantSite.restaurant.customer.
     */
    public Drinks(String name,String ingredients,double price,FoodPreferencesEnum preference){
        super(name,ingredients,price,preference);
        setDishTypeEnum(DishTypeEnum.DRINK);
    }
}
