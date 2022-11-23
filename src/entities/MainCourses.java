package entities;

import enumerations.DishTypeEnum;
import enumerations.FoodPreferencesEnum;

public class MainCourses extends Dish{

    public MainCourses(String name, String ingredients, double price, FoodPreferencesEnum preference, DishTypeEnum dishType) {
        super(name, ingredients, price, preference, dishType);
    }
}
