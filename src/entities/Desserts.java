package entities;

import enumerations.DishTypeEnum;
import enumerations.FoodPreferencesEnum;

public class Desserts extends Dish{

    public Desserts(String name, String ingredients, double price, FoodPreferencesEnum preference, DishTypeEnum dishType) {
        super(name, ingredients, price, preference, dishType);
    }
}
