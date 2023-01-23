package it.restaurantSite.customer;

import it.restaurantSite.databaseUtilities.DatabaseCreate;
import it.restaurantSite.databaseUtilities.DatabaseUpdate;
import it.restaurantSite.enumerations.FoodPreferencesEnum;
import java.sql.SQLException;


/**
 * The class that declare the Customer.
 */
public class Customer extends DatabaseCreate{

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
    public void insertNewRow() throws SQLException{
        getConnectionSqlCreateUpdate("INSERT INTO customer (name,food_preference) "+ "VALUES ('"
                                     + this.getCustomerName() + "', '" + this.getFoodPreference() + "' );");
        System.out.println("The customer: "+this.getCustomerName()+" Has been inserted!");
    }

    @Override
    public void deleteRow(int id) throws SQLException{
        getConnectionSqlCreateUpdate("DELETE FROM `customer` WHERE (`id_customer` = '"+id+"');");
        System.out.println("The customer with id: "+id+" has been deleted");
    }

    @Override
    public void createDatabaseTables() throws SQLException{
        getConnectionSqlCreateUpdate("CREATE TABLE `customer` ( "
                                     + "	`id_customer` INT(10) NOT NULL AUTO_INCREMENT, "
                                     + "	`name` VARCHAR(50) NOT NULL, "
                                     + "	`food_preference` ENUM('FULL_MENU','VEGETARIAN','VEGAN') NULL DEFAULT 'FULL_MENU', "
                                     + "	PRIMARY KEY (`id_customer`))");
        System.out.println("The table customer has been created!");
    }

    @Override
    public void deleteDatabaseTables() throws SQLException{
       getConnectionSqlCreateUpdate("DROP TABLE `customer`;");
        System.out.println("The table has been deleted!");
    }
}
