package entities;

import enumerations.DishTypeEnum;
import enumerations.FoodPreferencesEnum;

public class Drinks extends Dish{

    public Drinks(String name, String ingredients, double price, FoodPreferencesEnum preference, DishTypeEnum dishType) {
        super(name, ingredients, price, preference, dishType);
    }
}
