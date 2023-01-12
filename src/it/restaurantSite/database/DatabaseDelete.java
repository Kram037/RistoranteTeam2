package it.restaurantSite.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseDelete{
    private static final DatabaseDelete databaseDelete = new DatabaseDelete();
    private static final String url = "jdbc:mysql://localhost:3306/restaurant_database";
    private static final String user = "root";
    private static final String password = "password";
    private DatabaseDelete(){};
    public static DatabaseDelete getInstance(){return databaseDelete;}

    /**
     * Deletes a row from the Dish Table in the it.restaurantSite.restaurant.database
     * @param idDish it's the id row that will be deleted
     * @throws SQLException
     */
    public void deleteDishFromDb(int idDish) throws SQLException{
        Connection connection = DriverManager.getConnection(url,user,password);
        String querySql = "DELETE FROM dish WHERE id_dish = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(querySql);
        preparedStatement.setInt(1,idDish);
        int row = preparedStatement.executeUpdate();
        System.out.println(row != 0 ? "The row is deleted" : "The row doesn't exist");
    }
}
