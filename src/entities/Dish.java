package entities;


public class Dish{
  
  private String name;
  private String ingredients; 
  private double price;

  private FoodPreferences dishType;

  public Dish(String name, String ingredients, double price, FoodPreferences dishType){
    this.name = name;
    this.ingredients = ingredients;
    this.price = price;
    this.dishType = dishType;
  }

  public Dish() {

  }

  public void printDish(){
    System.out.println("Name: " + name
            + " - Ingredients: " + ingredients
            + " - Price : " + price );
  }

}
