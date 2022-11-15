package entities;
import Enumerations.FoodPreferencesEnum;

public class MainCourses extends Dish{

    public MainCourses(String name, String ingredients, double price, FoodPreferencesEnum dishType) {
        super(name, ingredients, price, dishType);
    }
}
