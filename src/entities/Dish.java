
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
   * @param name        the name
   * @param ingredients the ingredients
   * @param price       the price
   * @param preference  the preference
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
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets ingredients.
   *
   * @return the ingredients
   */
  public String getIngredients() {
    return ingredients;
  }

  /**
   * Gets price.
   *
   * @return the price
   */
  public double getPrice() {
    return price;
  }

  /**
   * Gets preference.
   *
   * @return the preference
   */
  public FoodPreferencesEnum getPreference() {
    return preference;
  }

  /**
   * Gets dish type enum.
   *
   * @return the dish type enum
   */
  public DishTypeEnum getDishTypeEnum() {
    return dishTypeEnum;
  }

  /**
   * Print the details of the dish.
   */
  public void printDish(){
    System.out.println("Name: " + name
            + " - Ingredients: " + ingredients
            + " - Price : " + price
            + " - Preference : " + dishTypeEnum);
  }
}
