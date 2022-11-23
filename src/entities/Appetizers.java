package entities;

import enumerations.DishTypeEnum;
import enumerations.FoodPreferencesEnum;

public class Appetizers extends Dish{


    public Appetizers(String name, String ingredients, double price, FoodPreferencesEnum preference, DishTypeEnum dishType) {
        super(name, ingredients, price, preference, dishType);
    }
}
