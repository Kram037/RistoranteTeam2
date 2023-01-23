package it.restaurantSite.databaseUtilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class DatabaseConnection{
    private final String url = "jdbc:mysql://localhost:3306/restaurant_database";
    private final String user = "root";
    private final String password = "password";
    private Connection connection;
    private Statement statement;

    public void getConnectionSqlCreateUpdate(String query) throws SQLException{
    connection = DriverManager.getConnection(url,user,password);
    statement = connection.createStatement();
    statement.executeUpdate(query);
    connection.close();
}

}
