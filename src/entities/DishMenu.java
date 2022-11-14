package entities;

import java.util.ArrayList;
import java.util.List;

public class DishMenu{

    public List<Dish> dishList = new ArrayList<>();

    public void addDish(Dish dish){
        dishList.add(dish);
    }

    public void printDishMenu(){
        System.out.println("Menu " + dishList.get(0).getClass().getSimpleName());



        for(Dish dish : dishList){

        }

    }
}
