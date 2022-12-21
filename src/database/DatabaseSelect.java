package database;

import entities.Dish;
import enumerations.FoodPreferencesEnum;

import java.sql.*;
import java.util.HashSet;
import java.util.Set;

public class DatabaseSelect{
    private String url;
    private String user;
    private String password;
    private Set<Dish> dishes = new HashSet<>();

    public String getUrl(){
        return url;
    }

    public void setUrl(String url){
        this.url = url;
    }

    public String getUser(){
        return user;
    }

    public void setUser(String user){
        this.user = user;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public Set<Dish> getDishes(){
        return dishes;
    }

    public void setDishes(Set<Dish> dishes){
        this.dishes = dishes;
    }

    /**
     * Prints all the details of the elements of the Set 'dishes' through a forEach
     */
    public void printDishesInfo(){
        dishes.forEach(single -> System.out.println("name: " + single.getName() + " ingredients: " +
        single.getIngredients() + " price: " + single.getPrice() + " food preference: " + single.getFoodPreference()));
    }

    /**
     * does select to the dish table and each table's row creates a dish object and adds to a Set(List)
     */
    public void addDishesFromDbTable(){
        Connection connection = null;
        try{
            url = "jdbc:mysql://localhost:3306/restaurant_database";
            user = "root";
            password = "password";
            connection = DriverManager.getConnection(url,user,password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM dishes");
            while(resultSet.next()){
                Dish dish = new Dish();
                dish.setName(resultSet.getString("name"));
                dish.setIngredients(resultSet.getString("ingredients"));
                dish.setPrice(resultSet.getDouble("price"));
                dish.setPreference(FoodPreferencesEnum.valueOf(resultSet.getString("food_preference")));
                dishes.add(dish);
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}

