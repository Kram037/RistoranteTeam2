package Entities;
import Enumerations.DishType;
import Enumerations.FoodPreferencesEnum;

public class SecondCourses extends Dish {

    public SecondCourses(String name, String ingredients, double price, FoodPreferencesEnum preference, DishType dishType) {
        super(name, ingredients, price, preference, dishType);
    }
}