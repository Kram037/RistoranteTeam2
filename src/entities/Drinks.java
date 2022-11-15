package entities;
import Enumerations.FoodPreferencesEnum;

public class Drinks extends Dish{

    public Drinks(String name, String ingredients, double price, FoodPreferencesEnum dishType) {
        super(name, ingredients, price, dishType);
    }
}
