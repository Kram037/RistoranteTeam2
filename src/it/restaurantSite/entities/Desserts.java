package it.restaurantSite.entities;
import it.restaurantSite.enumerations.DishTypeEnum;
import it.restaurantSite.enumerations.FoodPreferencesEnum;

/**
 * The class that declare the Desserts.
 */
public class Desserts extends Dish{
    /**
     * Instantiates a new Desserts.
     *
     * @param name        the name of the dessert.
     * @param ingredients the ingredients of the dessert.
     * @param price       the price of the dessert.
     * @param preference  the food preference of the it.restaurantSite.restaurant.customer.
     */
    public Desserts(String name,String ingredients,double price,FoodPreferencesEnum preference){
        super(name,ingredients,price,preference);
        setDishTypeEnum(DishTypeEnum.DESSERT);
    }

}
