import enumerations.FoodPreferencesEnum;

import java.sql.*;

public class DatabaseTable{

    public void insertDishInTable(int id_dish,String name,String ingredients,int price,
                                  FoodPreferencesEnum foodPreference) throws SQLException{
        String url      = "jdbc:mysql://localhost:3306/restaurant_database";
        String user     = "root";
        String password = "password";
        Connection connection = DriverManager.getConnection(url,user,password);
        String querySql = "INSERT INTO dishes (id_dish,name, ingredients, price, food_preference) VALUE(?,?,?,?,?);";
        PreparedStatement preparedStatement = connection.prepareStatement(querySql);
        preparedStatement.setInt(1,id_dish);
        preparedStatement.setString(2,name);
        preparedStatement.setString(3,ingredients);
        preparedStatement.setInt(4,price);
        preparedStatement.setString(5,String.valueOf(foodPreference));
        System.out.println("A new dish: "+ name + " was inserted");
        connection.close();
    }
    public static void main(String[] args){

        Connection connection = null;

        try{
            String url      = "jdbc:mysql://localhost:3306/restaurant_database";
            String user     = "root";
            String password = "password";

            connection = DriverManager.getConnection(url,user,password);

            Statement statement = connection.createStatement();

            String query = "CREATE SCHEMA IF NOT EXISTS restaurant_database;";


            String query1 = "CREATE TABLE IF NOT EXISTS dishes (id_dish INT(10) NOT NULL AUTO_INCREMENT," +
                    "name VARCHAR(255),ingredients VARCHAR(255),price INT(10)," +
                    "food_preference ENUM('FULL_MENU','VEGETARIAN','VEGAN'),PRIMARY KEY(id_dish));";

            String query2 = "INSERT INTO dishes (id_dish,name, ingredients, price, food_preference) VALUE("+
                    "2,'','garlic', 5,'VEGAN');";
            String query3 = "INSERT INTO dishes (id_dish,name, ingredients, price, food_preference) VALUE("+
                    "3,'Chips and Dips','Potatoes, sunflower oil, mayo, ketchup', 5,'VEGAN');";

            //statement.executeUpdate(query);
            statement.executeUpdate(query1);
            //statement.executeUpdate(query2);
            statement.executeUpdate(query3);
            System.out.println("queries executed");
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        } finally {
            try{
                if(connection != null){
                    connection.close();
                }
            }catch (SQLException ex){
                System.out.println(ex.getMessage());
            }
        }
    }

}

