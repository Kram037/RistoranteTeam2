package menu.dishes;
import Enumerations.KidMenuEnum;
import Enumerations.FoodPreferencesEnum;
import menu.Dish;

public class Drinks extends Dish {

    public Drinks(String name, String ingredients, double price, FoodPreferencesEnum dishType, KidMenuEnum kid) {
        super(name, ingredients, price, dishType, kid);
    }
}
