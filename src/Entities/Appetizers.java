package Entities;
import Entities.Enumerations.DishType;
import Entities.Enumerations.FoodPreferencesEnum;

public class Appetizers extends Dish{


    public Appetizers(String name, String ingredients, double price, FoodPreferencesEnum preference, DishType dishType) {
        super(name, ingredients, price, preference, dishType);
    }
}