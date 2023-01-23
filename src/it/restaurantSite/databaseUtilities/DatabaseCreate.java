package it.restaurantSite.databaseUtilities;

import java.sql.SQLException;

public abstract class DatabaseCreate extends DatabaseConnection{
   /**
     * To create a database schema
     * @throws SQLException catches any SQL exception
     */
    public void createDatabaseSchema() throws SQLException{
        getConnectionSqlCreateUpdate("");
        System.out.println("The schema has been created");
    }


    /**
     * To delete a database schema
     * @throws SQLException catches any SQL exception
     */
    public void deleteDatabaseSchema() throws SQLException{
        getConnectionSqlCreateUpdate("");
        System.out.println("The schema has been deleted");
    }

    /**
     * To create the table necessary for the database
     * @throws SQLException catches any SQL exception
     */
    public void createDatabaseTables() throws SQLException{
        getConnectionSqlCreateUpdate("");
        System.out.println("The tables have been created");
    }

    /**
     * To delete the tables in the database
     * @throws SQLException catches any SQL exception
     */
    public void deleteDatabaseTables() throws SQLException{
        getConnectionSqlCreateUpdate("");
        System.out.println("The tables have been deleted");
    }
    /**
     * To insert a row into database SQL
     * @throws SQLException catches any SQL exception
     */
    public void insertNewRow() throws SQLException{
        getConnectionSqlCreateUpdate("");
        System.out.println("New row has been inserted!");
    }

    /**
     * to delete a row in the database
     * @param id the id of the row you want to delete
     * @throws SQLException catches any SQL exception
     */
    public void deleteRow(int id) throws SQLException{
        getConnectionSqlCreateUpdate("");
        System.out.println("The row has been deleted");
    }

}
