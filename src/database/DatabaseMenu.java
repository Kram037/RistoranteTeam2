package database;

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
    public static DatabaseMenu getIstance(){return databaseMenu;}

    public void createTableDbMenu() throws SQLException{
        Connection connection = DriverManager.getConnection(url,user,password);
        Statement statement = connection.createStatement();
        String query1 = "" + "CREATE TABLE `menu` ( " + "	`id_menu` INT(10) NOT NULL AUTO_INCREMENT, "
                        + "	`name` VARCHAR(255) NOT NULL COLLATE 'utf8mb4_0900_ai_ci', "
                        + "	`price` INT(10) NOT NULL, "
                        + "	`type` ENUM('FULL_MENU','VEGETARIAN','VEGAN') NOT NULL DEFAULT 'FULL_MENU' COLLATE 'utf8mb4_0900_ai_ci', "
                        + "	`time_created` DATETIME NULL DEFAULT CURRENT_TIMESTAMP, "
                        + "	PRIMARY KEY (`id_menu`) USING BTREE " + ") " + "COLLATE='utf8mb4_0900_ai_ci' "
                        + "ENGINE=InnoDB " + "AUTO_INCREMENT=1 " + ";";
        statement.executeUpdate(query1);
        System.out.println("Table created!");
        connection.close();
    }
}


