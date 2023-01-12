package it.restaurantSite.entities;
import it.restaurantSite.databaseInterface.IDatabaseUpdate;
import it.restaurantSite.enumerations.FoodPreferencesEnum;
import it.restaurantSite.customer.Customer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * The Singleton used for instantiate the menu.
 */
public class Menu implements IDatabaseUpdate<Dish>{

    private static final Menu menu = new Menu();

    private static final String restaurantName = "I Secondini";

    private static final List<Course> courseList = new ArrayList<>();

    private Menu(){}

    /**
     * Get the instance of the menu.
     *
     * @return the instance menu.
     */
    public static Menu getInstance(){
        return menu;
    }

    public static List<Course> getCourseList(){
        return courseList;
    }

    /**
     *
     * @param course the course will be added
     * @deprecated this method is deprecated since it was created before using database SQL
     */
    @Deprecated
public void addDishMenu(Course course){
        courseList.add(course);
    }
    /**
     * Print the entire menu.
     * @deprecated this method is deprecated since it was created before using database SQL
     */
    @Deprecated
    public void printMenu(){

        System.out.println("\n" + restaurantName);

        for(Course dishMenu : courseList){
            dishMenu.printCourse();
        }
    }

    /**
     *
     * @param customer the customer whose preferences will be printed
     * @deprecated this method is deprecated since it was created before using database SQL
     */
    @Deprecated
    public void printPreferencedMenu(Customer customer) {

        if (customer.getFoodPreference() == FoodPreferencesEnum.FULL_MENU) {
            printMenu();
        } else {
            System.out.println("\n" + restaurantName);
            System.out.println("Menu " + customer.getFoodPreference().toString().toLowerCase());

            for (Course dishMenu : courseList) {
                dishMenu.printPreferenceCourse(customer);
            }
        }
    }


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

    @Override
    public void deleteTable(String tableName) throws SQLException{
        Connection connection = DriverManager.getConnection(url,user,password);
        String querySql = "DROP TABLE `"+tableName+"`;";
        Statement statement = connection.createStatement();
        int table = statement.executeUpdate(querySql);
        System.out.println(table!=0?"The table "+tableName+" is deleted":"The table doesn't exists");
        connection.close();
    }

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


    @Override
    public void deleteRow(String tableName,int idDish) throws SQLException{
        Connection connection = DriverManager.getConnection(url,user,password);
        String querySql = "DELETE FROM `"+tableName+"` WHERE (`id_dish` = '"+idDish+"');";
        Statement statement = connection.createStatement();
        int row = statement.executeUpdate(querySql);
        System.out.println(row != 0 ?"The dish number "+idDish+" has been deleted":"The row doesn't exists");
    }
}
