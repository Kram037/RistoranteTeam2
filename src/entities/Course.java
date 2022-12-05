package entities;

import customer.Customer;
import enumerations.FoodPreferencesEnum;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Course that contains the dish list.
 */
public class Course {

    /**
     * The Dish list that contains all the dishes.
     */
    public List<Dish> dishList = new ArrayList<>();

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

            for (Dish dish : dishList) {
                    dish.PrintInfoDish();
            }

    }

    /**
     * Prints every course according to customer preference
     * @param customer the customer to obtain his preference
     */
    public void printPreferencedCourse(Customer customer){

        System.out.println("\n" + dishList.get(0).getClass().getSimpleName());

        if(customer.getFoodPreference() == FoodPreferencesEnum.VEGAN) {
            for (Dish dish : dishList) {
                if(dish.getPreference() == FoodPreferencesEnum.VEGAN){
                    dish.PrintInfoDish();
                }
            }
        } else if(customer.getFoodPreference() == FoodPreferencesEnum.VEGETARIAN) {
            for (Dish dish : dishList) {
                if(dish.getPreference() == FoodPreferencesEnum.VEGAN || dish.getPreference() == FoodPreferencesEnum.VEGETARIAN){
                    dish.PrintInfoDish();
                }
            }
        }

    }
}
