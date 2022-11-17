package entities;
import Enumerations.FoodPreferencesEnum;

public class Appetizers extends Dish{


    public Appetizers(String name, String ingredients, double price, FoodPreferencesEnum dishType) {
        super(name, ingredients, price, dishType);
    }
}
