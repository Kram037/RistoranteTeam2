package it.restaurantSite.database;

import it.restaurantSite.entities.Dish;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseMenu{
    private final static DatabaseMenu databaseMenu = new DatabaseMenu();
    private static final String url = "jdbc:mysql://localhost:3306/restaurant_database";
    private static final String user = "root";
    private static final String password = "password";

    private DatabaseMenu(){
    }

    public static DatabaseMenu getIstance(){
        return databaseMenu;
    }

    public void createTableDbMenu() throws SQLException{
        Connection connection = DriverManager.getConnection(url,user,password);
        Statement statement = connection.createStatement();
        String query1 = ""+"CREATE TABLE `menu` ( "+"	`id_dish` INT(10) NOT NULL AUTO_INCREMENT, "
                        +"	`name` VARCHAR(255) NOT NULL, "+"	`ingredients` VARCHAR(255) NULL DEFAULT NULL, "
                        +"	`price` INT(10) NOT NULL, "
                        +"	`food_preference` ENUM('FULL_MENU','VEGETARIAN','VEGAN') NULL DEFAULT NULL, "
                        +"	`food_type` ENUM('DRINK','APPETIZER','MAIN_COURSE','SECOND_COURSE','DESSERT') NULL DEFAULT NULL, "
                        +"	`photo` VARCHAR(255) NULL DEFAULT NULL, "
                        +"	`time_created` DATETIME NULL DEFAULT CURRENT_TIMESTAMP, "
                        +"	PRIMARY KEY (`id_dish`) USING BTREE, "+"	UNIQUE INDEX `name` (`name`) USING BTREE "
                        +") "+"COLLATE='utf8mb4_0900_ai_ci' "+"ENGINE=InnoDB "+"AUTO_INCREMENT=1 ";
        statement.executeUpdate(query1);
        System.out.println("Table created!");
        connection.close();
    }
    public void insertDishInDbTable(Dish dish) throws SQLException{
        Connection connection = DriverManager.getConnection(url,user,password);
        String insertQuery = "INSERT INTO menu (name,ingredients,price,food_preference,food_type) " + "VALUES ('"
                             + dish.getName() + "', '" + dish.getIngredients() + "', '" + dish.getPrice() + "', '"
                             + dish.getFoodPreference() + "', '" + dish.getDishTypeEnum() + "' );";
        Statement statement = connection.createStatement();
        statement.executeUpdate(insertQuery);
        System.out.println("A new dish: " + dish.getName() + " was inserted in it.restaurantSite.restaurant.database");
        connection.close();
    }
}


