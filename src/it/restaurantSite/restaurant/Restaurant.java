package it.restaurantSite.restaurant;

import it.restaurantSite.databaseInterface.IDatabaseCreate;
import it.restaurantSite.enumerations.TableStatusEnum;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

/**
 * The class Restaurant.
 */
public class Restaurant implements IDatabaseCreate{

    private static Restaurant restaurant = new Restaurant();
    private Map<Table, Reservation> myRestaurant = new HashMap<>();

    private Restaurant() {
    }

    /**
     * Gets instance of the it.restaurantSite.restaurant singleton.
     *
     * @return the instance
     */
    public static Restaurant getInstance() {
        return restaurant;
    }

    /**
     * Gets my it.restaurantSite.restaurant map.
     *
     * @return the it.restaurantSite.restaurant
     */
    public Map<Table, Reservation> getMyRestaurant() {
        return myRestaurant;
    }

    /**
     * A method to reserve tables that checks the table state and the table available seats
     * adds table and reservation to the it.restaurantSite.restaurant map
     * modifies the table state and available seats
     *
     * @param table       the table
     * @param reservation the reservation
     */
    public void reserveTable(Table table, Reservation reservation){
        if(table.getTableState() == TableStatusEnum.OCCUPIED){
            System.out.println("Error : the requested table is already occupied by other customers");
        } else if(( table.getInitialSeats() >= reservation.getRequiredSeats() )){
            myRestaurant.put(table,reservation);
            table.setTableState(TableStatusEnum.OCCUPIED);
            table.setAvailableSeats(table.getInitialSeats() - reservation.getRequiredSeats());
            System.out.println("è stato riservato");
        } else {
            System.out.println("There aren't enough available seats for this reservation");
        }
    }

    /**
     * A method to clean tables that checks the table state
     * removes table and reservation from the it.restaurantSite.restaurant map
     * modifies the table state
     * @param table       the table
     * @param reservation the reservation
     * @return the reservation
     */
    public void cleanTable(Table table, Reservation reservation) {
        if (table.getTableState() == TableStatusEnum.AVAILABLE) {
            System.out.println("Error : the requested table had already been freed and cleaned");
        }
        else {
            myRestaurant.remove(table, reservation);
            table.setTableState(TableStatusEnum.AVAILABLE);
            table.setAvailableSeats(table.getInitialSeats());
        }
    }

    /**
     * Iterates through the it.restaurantSite.restaurant map and prints the details of the table, reservation and customers.
     */
    public void printRestaurantInfo() {
        restaurant.getMyRestaurant().forEach((table, reservation) -> System.out.println(table.getId() +
                " is " + table.getTableState().toString().toLowerCase() +
                " by reservation : " + reservation.getReservationInfo()));
    }
    @Override
    public void createDatabase() throws SQLException{
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306",this.user,this.password);
        Statement statement = connection.createStatement();
        String query ="CREATE DATABASE restaurant_database;";
        statement.executeUpdate(query);
        System.out.println("The database restaurant_database has been created!");
        connection.close();
    }

    @Override
    public void deleteDatabase() throws SQLException{
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306",this.user,this.password);
        Statement statement = connection.createStatement();
        String query ="DROP DATABASE `restaurant_database`;";
        statement.executeUpdate(query);
        System.out.println("The restaurant restaurant_database has been deleted");
        connection.close();
    }

    @Override
    public void createDatabaseTables() throws SQLException{
        Connection connection = DriverManager.getConnection(this.url,this.user,this.password);
        Statement statement = connection.createStatement();
        String query1 = ""+"CREATE TABLE `menu` ( "
                        +"	`id_dish` INT(10) NOT NULL AUTO_INCREMENT, "
                        +"	`name` VARCHAR(255) NOT NULL, "
                        +"	`ingredients` VARCHAR(255) NULL DEFAULT NULL, "
                        +"	`price` INT(10) NOT NULL, "
                        +"	`food_preference` ENUM('FULL_MENU','VEGETARIAN','VEGAN') NULL DEFAULT NULL, "
                        +"	`food_type` ENUM('DRINK','APPETIZER','MAIN_COURSE','SECOND_COURSE','DESSERT') NULL DEFAULT NULL, "
                        +"	`photo` VARCHAR(255) NULL DEFAULT NULL, "
                        +"	`time_created` DATETIME NULL DEFAULT CURRENT_TIMESTAMP, "
                        +"	PRIMARY KEY (`id_dish`), "+"	UNIQUE INDEX `name` (`name`) );";
        String query2 ="CREATE TABLE `customer` ( "
                       + "	`id_customer` INT(10) NOT NULL AUTO_INCREMENT, "
                       + "	`name` VARCHAR(50) NOT NULL, "
                       + "	`food_preference` ENUM('FULL_MENU','VEGETARIAN','VEGAN') NULL DEFAULT 'FULL_MENU', "
                       + "	PRIMARY KEY (`id_customer`))";
        statement.executeUpdate(query1);
        statement.executeUpdate(query2);
        System.out.println("The table menu and customer are been created!");
        connection.close();
    }
    @Override
    public void deleteDatabaseTables() throws SQLException{
        Connection connection = DriverManager.getConnection(url,user,password);
        String query1 = "DROP TABLE `menu`;";
        String query2 = "DROP TABLE `customer`;";
        Statement statement = connection.createStatement();
        statement.executeUpdate(query1);
        statement.executeUpdate(query2);
        System.out.println("The table menu and customer are been deleted");
        connection.close();
    }


}