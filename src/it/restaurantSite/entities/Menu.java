package it.restaurantSite.entities;
import it.restaurantSite.databaseInterface.IDatabaseUpdate;
import java.sql.*;

/**
 * The Singleton used for instantiate the menu.
 */
public class Menu implements IDatabaseUpdate<Dish>{

    private static final Menu menu = new Menu();

    private static final String restaurantName = "I Secondini";


    private Menu(){}

    /**
     * Get the instance of the menu.
     *
     * @return the instance menu.
     */
    public static Menu getInstance(){
        return menu;
    }

    @Override
    public void insertDatabaseNewRow(Dish dish) throws SQLException{
        Connection connection = DriverManager.getConnection(url,user,password);
        String insertQuery = "INSERT INTO menu (name,ingredients,price,food_preference,food_type) "+ "VALUES ('"
                             + dish.getName() + "', '" + dish.getIngredients() + "', '" + dish.getPrice() + "', '"
                             + dish.getFoodPreference() + "', '" + dish.getDishTypeEnum() + "' );";
        Statement statement = connection.createStatement();
        statement.executeUpdate(insertQuery);
        System.out.println("A new dish: " + dish.getName() + " was inserted in the table menu");
        connection.close();
    }


    @Override
    public void deleteDatabaseRow(int idDish) throws SQLException{
        Connection connection = DriverManager.getConnection(url,user,password);
        String querySql = "DELETE FROM `menu` WHERE (`id_dish` = '"+idDish+"');";
        Statement statement = connection.createStatement();
        int row = statement.executeUpdate(querySql);
        System.out.println(row != 0 ?"The dish number "+idDish+" has been deleted":"The row doesn't exists");
        connection.close();
    }
}
