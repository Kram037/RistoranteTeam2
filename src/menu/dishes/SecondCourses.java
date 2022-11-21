package menu.dishes;
import Enumerations.KidMenuEnum;
import Enumerations.FoodPreferencesEnum;
import menu.Dish;

public class SecondCourses extends Dish {

    public SecondCourses(String name, String ingredients, double price, FoodPreferencesEnum dishType, KidMenuEnum kid) {
        super(name, ingredients, price, dishType, kid);
    }
}