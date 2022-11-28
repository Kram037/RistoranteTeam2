
package entities;
import enumerations.DishTypeEnum;
import enumerations.FoodPreferencesEnum;

/**
 * Super class that is extended by all the dishes (Drinks, Appetizers, etc..).
 */
public class Dish{
  
  private String name;
  private String ingredients; 
  private double price;

  private FoodPreferencesEnum preference;
  private DishTypeEnum dishTypeEnum;

  /**
   * Instantiates a new Dish.
   *
   * @param name        the name of the dish.
   * @param ingredients the ingredients of the dish.
   * @param price       the price of the dish.
   * @param preference  the preference of the customer.
   */
  public Dish(String name, String ingredients, double price, FoodPreferencesEnum preference){
    this.name = name;
    this.ingredients = ingredients;
    this.price = price;
    this.preference = preference;
  }


  /**
   * Instantiates a new Dish.
   */
  public Dish(){}

  /**
   * Gets name.
   *
   * @return the name of the dish.
   */
  public String getName() {
    return name;
  }

  /**
   * Gets ingredients.
   *
   * @return the ingredients of the dish.
   */
  public String getIngredients() {
    return ingredients;
  }

  /**
   * Gets price.
   *
   * @return the price of the dish.
   */
  public double getPrice() {
    return price;
  }

  /**
   * Gets preference.
   *
   * @return the preference of the customer.
   */
  public FoodPreferencesEnum getPreference() {
    return preference;
  }

  /**
   * Gets dish type enum.
   *
   * @return the dish type.
   */
  public DishTypeEnum getDishTypeEnum() {
    return dishTypeEnum;
  }

  /**
   * Print the details of the dish.
   */
  public void printCourse(){
    System.out.println("Name: " + name
            + " - Ingredients: " + ingredients
            + " - Price : " + price);
  }
}
