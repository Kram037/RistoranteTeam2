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


    /**
     *
     * @param tableName the name that the table will have
     * @throws SQLException
     */
    @Override
    public void createTable(String tableName) throws SQLException{
        Connection connection = DriverManager.getConnection(this.url,this.user,this.password);
        Statement statement = connection.createStatement();
        String query1 = ""+"CREATE TABLE `"+tableName+"` ( "
                        +"	`id_dish` INT(10) NOT NULL AUTO_INCREMENT, "
                        +"	`name` VARCHAR(255) NOT NULL, "
                        +"	`ingredients` VARCHAR(255) NULL DEFAULT NULL, "
                        +"	`price` INT(10) NOT NULL, "
                        +"	`food_preference` ENUM('FULL_MENU','VEGETARIAN','VEGAN') NULL DEFAULT NULL, "
                        +"	`food_type` ENUM('DRINK','APPETIZER','MAIN_COURSE','SECOND_COURSE','DESSERT') NULL DEFAULT NULL, "
                        +"	`photo` VARCHAR(255) NULL DEFAULT NULL, "
                        +"	`time_created` DATETIME NULL DEFAULT CURRENT_TIMESTAMP, "
                        +"	PRIMARY KEY (`id_dish`), "+"	UNIQUE INDEX `name` (`name`) "
                        +") "+"COLLATE='utf8mb4_0900_ai_ci' "+"ENGINE=InnoDB "+"AUTO_INCREMENT=1 ";
        statement.executeUpdate(query1);
        System.out.println("Table "+tableName+" has been created!");
        connection.close();
    }

    /**
     *
     * @param tableName the table that will be deleted
     * @throws SQLException
     */
    @Override
    public void deleteTable(String tableName) throws SQLException{
        Connection connection = DriverManager.getConnection(url,user,password);
        String querySql = "DROP TABLE `"+tableName+"`;";
        Statement statement = connection.createStatement();
        int table = statement.executeUpdate(querySql);
        System.out.println(table!=0?"The table "+tableName+" is deleted":"The table doesn't exists");
        connection.close();
    }

    /**
     *
     * @param tableName the name of the table where will be inserted the row
     * @param dish generics that will be specified to be inserted into the correct table
     * @throws SQLException
     */
    @Override
    public void insertNewRow(String tableName,Dish dish) throws SQLException{
        Connection connection = DriverManager.getConnection(url,user,password);
        String insertQuery = "INSERT INTO "+tableName+" (name,ingredients,price,food_preference,food_type) "+ "VALUES ('"
                             + dish.getName() + "', '" + dish.getIngredients() + "', '" + dish.getPrice() + "', '"
                             + dish.getFoodPreference() + "', '" + dish.getDishTypeEnum() + "' );";
        Statement statement = connection.createStatement();
        statement.executeUpdate(insertQuery);
        System.out.println("A new dish: " + dish.getName() + " was inserted in the table "+tableName);
        connection.close();
    }

    /**
     *
     * @param tableName the table where the row will be deleted
     * @param idDish to specify the id of the row that will be deleted
     * @throws SQLException
     */
    @Override
    public void deleteRow(String tableName,int idDish) throws SQLException{
        Connection connection = DriverManager.getConnection(url,user,password);
        String querySql = "DELETE FROM `"+tableName+"` WHERE (`id_dish` = '"+idDish+"');";
        Statement statement = connection.createStatement();
        int row = statement.executeUpdate(querySql);
        System.out.println(row != 0 ?"The dish number "+idDish+" has been deleted":"The row doesn't exists");
    }
}
