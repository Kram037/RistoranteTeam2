package entities;
import Enumerations.KidMenuEnum;
import Enumerations.FoodPreferencesEnum;

public class Dish{
  
  private String name;
  private String ingredients; 
  private double price;

  private FoodPreferencesEnum dishType;
  private KidMenuEnum kid;

  public Dish(String name, String ingredients, double price, FoodPreferencesEnum dishType, KidMenuEnum kid){
    this.name = name;
    this.ingredients = ingredients;
    this.price = price;
    this.dishType = dishType;
    this.kid = kid;
  }

  public Dish(){}

  public void printDish(){
    System.out.println("Name: " + name
            + " - Ingredients: " + ingredients
            + " - Price : " + price +
            " - Preference : " + dishType +
            " - Kid : " + kid);
  }
}
