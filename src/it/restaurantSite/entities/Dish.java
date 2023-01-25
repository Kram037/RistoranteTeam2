package it.restaurantSite.entities;
import it.restaurantSite.databaseUtilities.DatabaseConnection;
import it.restaurantSite.enumerations.DishTypeEnum;
import it.restaurantSite.enumerations.FoodPreferencesEnum;

import java.sql.SQLException;

/**
 * Super class that is extended by all the dishes (Drinks, Appetizers, etc..).
 */
public class Dish extends DatabaseConnection{
  private String name;
  private String ingredients; 
  private double price;

  private FoodPreferencesEnum preference;
  private DishTypeEnum dishTypeEnum;
  /**
   * Instantiates a new Dish.
   */
  public Dish(){}
  /**
   * Instantiates a new Dish.
   *
   * @param name        the name of the dish.
   * @param ingredients the ingredients of the dish.
   * @param price       the price of the dish.
   * @param preference  the preference of the it.restaurantSite.restaurant.customer.
   */
  public Dish(String name, String ingredients, double price, FoodPreferencesEnum preference){
    this.name = name;
    this.ingredients = ingredients;
    this.price = price;
    this.preference = preference;

  }

  // GETTERS AND SETTERS
  public void setName(String name){
    this.name = name;
  }

  public void setIngredients(String ingredients){
    this.ingredients = ingredients;
  }

  public void setPrice(double price){
    this.price = price;
  }

  public void setPreference(FoodPreferencesEnum preference){
    this.preference = preference;
  }

  public void setDishTypeEnum(DishTypeEnum dishTypeEnum){
    this.dishTypeEnum = dishTypeEnum;
  }


  public String getName() {
    return name;
  }


  public String getIngredients() {
    return ingredients;
  }


  public double getPrice() {
    return price;
  }


  public FoodPreferencesEnum getFoodPreference() {
    return preference;
  }

  public DishTypeEnum getDishTypeEnum(){
    return dishTypeEnum;
  }



  public void insertNewRow() throws SQLException{
    getConnectionSqlCreateUpdate("INSERT INTO menu (name,ingredients,price,food_preference,food_type) "+ "VALUES ('"
                                 + this.getName() + "', '" + this.getIngredients() + "', '" + this.getPrice() + "', '"
                                 + this.getFoodPreference() + "', '" + this.getDishTypeEnum() + "' );");
    System.out.println("The dish: "+this.getName()+" has been inserted!");
  }


  public void deleteRow(int id) throws SQLException{
    getConnectionSqlCreateUpdate("DELETE FROM `menu` WHERE (`id_dish` = '"+id+"');");
    System.out.println("The dish: "+this.getName()+" has been deleted!");
  }
}
