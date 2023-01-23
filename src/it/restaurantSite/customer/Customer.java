package it.restaurantSite.customer;


import it.restaurantSite.databaseUtilities.DatabaseCreate;
import it.restaurantSite.enumerations.FoodPreferencesEnum;

import java.sql.*;


/**
 * The class that declare the Customer.
 */
public class Customer extends DatabaseCreate{



    private String customerName;
    private String customerEmail;
    private String password;
    private FoodPreferencesEnum foodPreference;

    /**
     * Instantiates a new Customer
     * @param customerName   the it.restaurantSite.restaurant.customer name
     * @param customerEmail   the it.restaurantSite.restaurant.customer email
     * @param password   the it.restaurantSite.restaurant.customer password
     * @param foodPreference the food preference of the it.restaurantSite.restaurant.customer(VEGAN, VEGETARIAN, DEFAULT)
     */
    public Customer(String customerName, String customerEmail, String password, FoodPreferencesEnum foodPreference) {
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.password = password;
        this.foodPreference = foodPreference;
    }

    //GETTERS
    public String getCustomerName() {
        return customerName;
    }
    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getPassword() {
        return password;
    }

    public FoodPreferencesEnum getFoodPreference() {
        return foodPreference;
    }

    /**
     * Print info it.restaurantSite.restaurant.customer.
     */
    public void infoCustomer() throws SQLException{
        Connection connection = DriverManager.getConnection(getUrl(), getUser(), getPassword());
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT customer_name, customer_email,password FROM customer WHERE '"+ this.getCustomerEmail() + "'");

        System.out.println("- name:" + resultSet.getString("customer_name") +" - email: " +
                resultSet.getString("customer_email") + "password" + resultSet.getString("password"));

        connection.close();
    }

    /**
     * Methods to make customer insert a reservation
     * @throws SQLException
     */
    public void insertNewReservation() throws SQLException{
        getConnectionSqlCreateUpdate("INSERT INTO reservation (name,food_preference) "+ "VALUES ('"
                + this.getCustomerName() + "', '" + this.getFoodPreference() + "' );");
        System.out.println("A new reservation: " + this.getCustomerName() + " was inserted in the table customer");
    }

    @Override
    public void insertNewRow() throws SQLException{
        getConnectionSqlCreateUpdate("INSERT INTO customer (customer_name, customer_email, password, food_preference) " + "VALUES ('"
                + this.getCustomerName() + "','" + this.getCustomerEmail() + "',  '" + this.getPassword() + "',  '" + this.getFoodPreference() + "');");
        System.out.println("The customer: "+this.getCustomerName()+" Has been inserted!");
    }

    @Override
    public void deleteRow(int id) throws SQLException{
        getConnectionSqlCreateUpdate("DELETE FROM `customer` WHERE (`id_customer` = '"+id+"');");
        System.out.println("The customer with id: "+id+" has been deleted");
    }

    @Override
    public void createDatabaseTables() throws SQLException{
        getConnectionSqlCreateUpdate( ""+"CREATE TABLE `customer` ( "
                +"	`customer_id` INT(10) NOT NULL AUTO_INCREMENT, "
                +"	`customer_name` VARCHAR(255) NOT NULL, "
                +"	`customer_email` VARCHAR(255) NULL DEFAULT NULL, "
                +"	`password` VARCHAR(20) NOT NULL, "
                +"	`food_preference` VARCHAR(25) NULL DEFAULT NULL, "
                +"	`time_created` DATETIME NULL DEFAULT CURRENT_TIMESTAMP, "
                +"	PRIMARY KEY (`customer_id`), "+"	UNIQUE INDEX `customer_email` (`customer_email`) );");
        System.out.println("The table customer has been created!");
    }

    @Override
    public void deleteDatabaseTables() throws SQLException{
       getConnectionSqlCreateUpdate("DROP TABLE `customer`;");
        System.out.println("The table has been deleted!");
    }
}
