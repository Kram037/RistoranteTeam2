package it.restaurantSite.customer;
import it.restaurantSite.databaseInterface.IDatabaseUpdate;
import it.restaurantSite.enumerations.FoodPreferencesEnum;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * The class that declare the Customer.
 */
public class Customer implements IDatabaseUpdate<Customer>{

    private  String customerName;
    private FoodPreferencesEnum foodPreference;

    /**
     * Instantiates a new Customer
     * @param customerName   the it.restaurantSite.restaurant.customer name
     * @param foodPreference the food preference of the it.restaurantSite.restaurant.customer(VEGAN, VEGETARIAN, DEFAULT)
     */
    public Customer(String customerName, FoodPreferencesEnum foodPreference){
        this.customerName = customerName;
        this.foodPreference = foodPreference;
    }

    //GETTERS
    public String getCustomerName() {
        return customerName;
    }

    public FoodPreferencesEnum getFoodPreference() {
        return foodPreference;
    }

    /**
     * Print info it.restaurantSite.restaurant.customer.
     */
    public void infoCustomer(){
        System.out.println("Customer name: " + customerName + " Food preference: " + foodPreference);
    }
    @Override
    public void insertDatabaseNewRow(Customer customer) throws SQLException{
        Connection connection = DriverManager.getConnection(url,user,password);
        String insertQuery = "INSERT INTO customer (name,food_preference) "+ "VALUES ('"
                             + customer.getCustomerName() + "', '" + customer.getFoodPreference() + "' );";
        Statement statement = connection.createStatement();
        statement.executeUpdate(insertQuery);
        System.out.println("A new customer: " + customer.getCustomerName() + " was inserted in the table customer");
        connection.close();
    }

    @Override
    public void deleteDatabaseRow(int id) throws SQLException{
        Connection connection = DriverManager.getConnection(url,user,password);
        String querySql = "DELETE FROM `customer` WHERE (`id_customer` = '"+id+"');";
        Statement statement = connection.createStatement();
        int row = statement.executeUpdate(querySql);
        System.out.println(row != 0 ?"The customer number "+id+" has been deleted":"The row doesn't exists");
        connection.close();
    }
}
