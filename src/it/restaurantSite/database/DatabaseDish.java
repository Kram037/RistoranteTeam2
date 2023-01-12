package it.restaurantSite.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseDish{
    private static DatabaseDish databaseDish = new DatabaseDish();
    private static final String url = "jdbc:mysql://localhost:3306/restaurant_database";
    private static final String user = "root";
    private static final String password = "password";

    private DatabaseDish(){
    }

    public static DatabaseDish getIstance(){
        return databaseDish;
    }

    public void createTableDbDish() throws SQLException{
        Connection connection = DriverManager.getConnection(url,user,password);
        Statement statement = connection.createStatement();
        //String query = "CREATE SCHEMA IF NOT EXISTS restaurant_database;";
        String query1 = "" + "CREATE TABLE `dish` ( " + "	`id_dish` INT(10) NOT NULL AUTO_INCREMENT, "
                        + "	`name` VARCHAR(255) NOT NULL COLLATE 'utf8mb4_0900_ai_ci', "
                        + "	`ingredients` VARCHAR(255) NULL DEFAULT NULL COLLATE 'utf8mb4_0900_ai_ci', "
                        + "	`price` INT(10) NOT NULL, "
                        + "	`food_preference` ENUM('FULL_MENU','VEGETARIAN','VEGAN') NULL DEFAULT NULL COLLATE 'utf8mb4_0900_ai_ci', "
                        + "	`food_type` ENUM('DRINK','APPETIZER','MAIN_COURSE','SECOND_COURSE','DESSERT') NULL DEFAULT NULL COLLATE 'utf8mb4_0900_ai_ci', "
                        + "	`time_created` DATETIME NULL DEFAULT CURRENT_TIMESTAMP, "
                        + "	PRIMARY KEY (`id_dish`) USING BTREE, " + "	UNIQUE INDEX `name` (`name`) USING BTREE "
                        + ") " + "COLLATE='utf8mb4_0900_ai_ci' " + "ENGINE=InnoDB " + ";";
        statement.executeUpdate(query1);
        System.out.println("Table created!");
        connection.close();
    }
}

