package entities;

import java.util.ArrayList;
import java.util.List;

public class DishMenu <T extends Dish> {

    public List<T> dishList = new ArrayList<>();

    public void addDish(T dish){
        dishList.add(dish);
    }

    public void printDishMenu(){
        System.out.println("Menu " + dishList.get(0).getClass().getSimpleName());

        for(T dish : dishList){
            dish.printDish();
        }

    }
}
