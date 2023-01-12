package it.restaurantSite.entities;

import it.restaurantSite.customer.Customer;
import it.restaurantSite.enumerations.FoodPreferencesEnum;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Course that contains the dish list.
 */
public class Course{

    /**
     * The Dish list that contains all the dishes.
     */
    private List<Dish> dishList = new ArrayList<>();

    public List<Dish> getDishList(){
        return dishList;
    }

    public void setDishList(List<Dish> dishList){
        this.dishList = dishList;
    }

    /**
     * Add dish to the dish list.
     *
     * @param dish the dish added to the list.
     */
    public void addDish(Dish dish){
        dishList.add(dish);
    }

    /**
     * Print the lists of a single course.
     */
    public void printCourse(){
        System.out.println("\n" + dishList.get(0).getClass().getSimpleName());
        for (Dish dish : dishList){
            dish.PrintInfoDish();
        }
    }

    /**
     * Prints every course according to it.restaurantSite.restaurant.customer preference
     *
     * @param customer the it.restaurantSite.restaurant.customer to obtain his preference
     */
    public void printPreferenceCourse(@NotNull Customer customer){
        if (customer == null) {
            throw new IllegalArgumentException("it.restaurantSite.restaurant.customer cannot be null");
        }

        System.out.println("\n" + dishList.get(0).getClass().getSimpleName());

        if(customer.getFoodPreference() == FoodPreferencesEnum.VEGAN){
            for (Dish dish : dishList){
                if(dish.getFoodPreference() == FoodPreferencesEnum.VEGAN){
                    dish.PrintInfoDish();
                }
            }
        } else if(customer.getFoodPreference() == FoodPreferencesEnum.VEGETARIAN){
            for (Dish dish : dishList){
                if(dish.getFoodPreference() == FoodPreferencesEnum.VEGAN
                   || dish.getFoodPreference() == FoodPreferencesEnum.VEGETARIAN){
                    dish.PrintInfoDish();
                }
            }
        }
    }
}
