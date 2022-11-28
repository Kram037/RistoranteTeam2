package entities;

import customer.Customer;

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
    public void printDishMenu(Customer customer){

        System.out.println("\nMenu " + dishList.get(0).getClass().getSimpleName());

            for (Dish dish : dishList) {
                if(dish.getPreference().ordinal() >= customer.foodPreference.ordinal()) {
                    dish.printDish();
                }
            }

    }
}
