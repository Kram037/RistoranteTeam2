package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseTable {
    private final static DatabaseTable databaseTable = new DatabaseTable();
    private static final String url = "jdbc:mysql://localhost:3306/restaurant_database";
    private static final String user = "root";
    private static final String password = "password";

    private DatabaseTable() {
    }

    public static DatabaseTable getIstance() {
        return databaseTable;
    }

    public void createTableTable() throws SQLException {
        Connection connection = DriverManager.getConnection(url, user, password);
        Statement statement = connection.createStatement();

        String query1 = ""
                + "CREATE TABLE `table` ( "
                + "	`id_table` INT NOT NULL, "
                + "	`name` VARCHAR(50) NULL DEFAULT NULL, "
                + "	`initial_seats` INT(10) NULL DEFAULT NULL, "
                + "	`available_seats` INT(10) NULL DEFAULT NULL, "
                + "	`Table_status` ENUM('AVAILABLE','OCCUPIED','RESERVERED') NOT NULL DEFAULT 'AVAILABLE', "
                + "	PRIMARY KEY (`id_table`) "
                + ") "
                + "COLLATE='utf8mb4_0900_ai_ci';";

        statement.executeUpdate(query1);
        System.out.println("Table created!");
        connection.close();
    }
}
