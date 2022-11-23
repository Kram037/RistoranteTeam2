package entities;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Course that contains the dish list.
 */
public class Course {

    /**
     * The Dish list.
     */
    public List<Dish> dishList = new ArrayList<>();

    /**
     * Add dish to the dish list.
     *
     * @param dish the dish
     */
    public void addDish(Dish dish){
        dishList.add(dish);
    }

    /**
     * Print the entire menu.
     */
    public void printDishMenu(){

        System.out.println("\nMenu " + dishList.get(0).getClass().getSimpleName());

        for(Dish dish : dishList){
            dish.printDish();
        }
    }
}
