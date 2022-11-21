package menu.dishes;
import Enumerations.KidMenuEnum;
import Enumerations.FoodPreferencesEnum;
import menu.Dish;

public class Appetizers extends Dish {


    public Appetizers(String name, String ingredients, double price, FoodPreferencesEnum dishType, KidMenuEnum kid) {
        super(name, ingredients, price, dishType, kid);
    }
}
