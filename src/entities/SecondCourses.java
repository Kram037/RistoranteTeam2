package entities;

import enumerations.DishTypeEnum;
import enumerations.FoodPreferencesEnum;

public class SecondCourses extends Dish {

    public SecondCourses(String name, String ingredients, double price, FoodPreferencesEnum preference, DishTypeEnum dishType) {
        super(name, ingredients, price, preference, dishType);
    }
}