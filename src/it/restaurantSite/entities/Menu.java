package it.restaurantSite.entities;


import it.restaurantSite.databaseUtilities.DatabaseConnection;

import java.sql.SQLException;


/**
 * The Singleton used for instantiate the menu.
 */
public class Menu extends DatabaseConnection{

    private static final Menu menu = new Menu();
    private Menu(){}

    /**
     * Get the instance of the menu.
     *
     * @return the instance menu.
     */
    public static Menu getInstance(){
        return menu;
    }


    public void createDatabaseTables() throws SQLException{
        getConnectionSqlCreateUpdate(""+"CREATE TABLE `menu` ( "
                                     +"	`id_dish` INT(10) NOT NULL AUTO_INCREMENT, "
                                     +"	`name` VARCHAR(255) NOT NULL, "
                                     +"	`ingredients` VARCHAR(255) NULL DEFAULT NULL, "
                                     +"	`price` INT(10) NOT NULL, "
                                     +"	`food_preference` ENUM('FULL_MENU','VEGETARIAN','VEGAN') NULL DEFAULT NULL, "
                                     +"	`food_type` ENUM('DRINK','APPETIZER','MAIN_COURSE','SECOND_COURSE','DESSERT') NULL DEFAULT NULL, "
                                     +"	`photo` VARCHAR(255) NULL DEFAULT NULL, "
                                     +"	`time_created` DATETIME NULL DEFAULT CURRENT_TIMESTAMP, "
                                     +"	PRIMARY KEY (`id_dish`), "+"	UNIQUE INDEX `name` (`name`) );");
        System.out.println("The table has been created!");
    }

    public void deleteDatabaseTables() throws SQLException{
        getConnectionSqlCreateUpdate("DROP TABLE `menu`;");
    }
}
