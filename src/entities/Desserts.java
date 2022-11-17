package entities;
import Enumerations.FoodPreferencesEnum;

public class Desserts extends Dish{

    public Desserts(String name, String ingredients, double price, FoodPreferencesEnum dishType) {
        super(name, ingredients, price, dishType);
    }
}
