package database;

import entities.Dish;

import java.sql.*;

public class DatabaseInsert{
    private static final DatabaseInsert databaseTable = new DatabaseInsert();
   private final String url = "jdbc:mysql://localhost:3306/restaurant_database";
   private final String user = "root";
   private final String password = "password";
   private DatabaseInsert(){
    }

    public static DatabaseInsert getInstance(){
        return databaseTable;
    }

    /**
     * Adds dish to database
     *
     * @param dish which will be added
     */
    public void insertDishInDbTable(Dish dish) throws SQLException{
        Connection connection = DriverManager.getConnection(url,user,password);
        String insertQuery = "INSERT INTO dish (name,ingredients,price,food_preference,food_type) " + "VALUES ('"
                             + dish.getName() + "', '" + dish.getIngredients() + "', '" + dish.getPrice() + "', '"
                             + dish.getFoodPreference() + "');";
        Statement statement = connection.createStatement();
        statement.executeUpdate(insertQuery);
        System.out.println("A new dish: " + dish.getName() + " was inserted in database");
        connection.close();
    }
}




