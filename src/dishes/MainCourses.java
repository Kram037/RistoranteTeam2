package dishes;
import Enumerations.KidMenuEnum;
import Enumerations.FoodPreferencesEnum;
import entities.Dish;

public class MainCourses extends Dish {

    public MainCourses(String name, String ingredients, double price, FoodPreferencesEnum dishType, KidMenuEnum kid) {
        super(name, ingredients, price, dishType, kid);
    }
}
