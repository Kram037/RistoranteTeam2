package Entities;
import Enumerations.DishType;
import Enumerations.FoodPreferencesEnum;

public class Dish{
  
  private String name;
  private String ingredients; 
  private double price;

  private FoodPreferencesEnum preference;
  private DishType dishType;

  public Dish(String name, String ingredients, double price, FoodPreferencesEnum preference, DishType dishType){
    this.name = name;
    this.ingredients = ingredients;
    this.price = price;
    this.preference = preference;
    this.dishType = dishType;
  }

  public Dish(){}

  public void printDish(){
    System.out.println("Name: " + name
            + " - Ingredients: " + ingredients
            + " - Price : " + price );
  }
}
