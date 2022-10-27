package entities;

public class Dish{
  
  private String name;
  private String ingredients; 
  private double price;
  
  public Dish(String name, String ingredients, double price){
  this.name = name;
  this.ingredients = ingredients;
  this.price = price;
  }

  @Override
  public String toString() {
    return "\n\n" + name  +
            "  " + price + "€\n" +
            "ingredients: " + ingredients;
  }







}
