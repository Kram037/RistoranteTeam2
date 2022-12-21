package database;

import entities.Dish;
import enumerations.FoodPreferencesEnum;

import java.sql.*;

public class DatabaseTable{
    private static final DatabaseTable databaseTable = new DatabaseTable();
    private String url;
    private String user;
    private String password;

    private DatabaseTable(){
    }
    public String getUrl(){
        return url;
    }

    public String getUser(){
        return user;
    }

    public String getPassword(){
        return password;
    }
    public static DatabaseTable getInstance(){
        return databaseTable;
    }

    /**
     * to add dishes in the database
     *
     * @param id_dish        it's the primary key in the database
     * @param name           of dish
     * @param ingredients    of dish
     * @param price          of dish
     * @param foodPreference for what kind of customer
     */
    public void insertDishInDbTable(int id_dish,String name,String ingredients,double price,FoodPreferencesEnum foodPreference){
        url = "jdbc:mysql://localhost:3306/restaurant_database";
        user = "root";
        password = "password";
        Connection connection = null;
        try{connection = DriverManager.getConnection(url,user,password);
            String querySql = "INSERT INTO dishes (id_dish,name, ingredients, price, food_preference) VALUE(?,?,?,?,?);";
            PreparedStatement preparedStatement = connection.prepareStatement(querySql);
            preparedStatement.setInt(1,id_dish);
            preparedStatement.setString(2,name);
            preparedStatement.setString(3,ingredients);
            preparedStatement.setDouble(4,price);
            preparedStatement.setString(5,String.valueOf(foodPreference));
            preparedStatement.executeUpdate();
            System.out.println("A new dish: " + name + " was inserted in database");
        }catch(SQLException e){
            System.out.println(e.getMessage());
        } finally {
            try{
                if(connection != null){
                    connection.close();
                }
            }catch(SQLException ex){
                System.out.println(ex.getMessage());
            }
        }
    }

    /**
     * Adds dish to database
     * //* @param id_dish primary key in the database, it cannot be double
     *
     * @param dish which will be added
     */
    public void insertDishInDbTable2(int id_dish,Dish dish){
        url = "jdbc:mysql://localhost:3306/restaurant_database";
        user = "root";
        password = "password";
        Connection connection = null;
        try{connection = DriverManager.getConnection(url,user,password);
            String querySql = "INSERT INTO dishes (id_dish,name, ingredients, price, food_preference) VALUE(?,?,?,?,?);";
            PreparedStatement preparedStatement = connection.prepareStatement(querySql);
            preparedStatement.setInt(1,id_dish);
            preparedStatement = connection.prepareStatement(querySql);
            preparedStatement.setInt(1,id_dish);
            preparedStatement.setString(2,dish.getName());
            preparedStatement.setString(3,dish.getIngredients());
            preparedStatement.setDouble(4,dish.getPrice());
            preparedStatement.setString(5,String.valueOf(dish.getFoodPreference()));
            preparedStatement.executeUpdate();
            System.out.println("A new dish: " + dish.getName() + " was inserted in database");
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }finally{try{
                if(connection != null){
                    connection.close();}
            }catch(SQLException ex){
                System.out.println(ex.getMessage());
            }
        }
    }
}



