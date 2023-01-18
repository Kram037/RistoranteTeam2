package it.restaurantSite.databaseInterface;


import java.sql.SQLException;

public interface IDatabaseCreate extends IDatabaseDataPath{
    /**
     * Creates a table in the schema which is specified in the url
     * @throws SQLException catches any SQL exceptions
     */
    void createDatabaseTables() throws SQLException;

    /**
     * Deletes a table in the schema which is specified in the url
     * @throws SQLException catches any SQL exceptions
     */
    void deleteDatabaseTables() throws SQLException;

    /**
     * Creates a database SQL schema
     * @throws SQLException catches any SQL exceptions
     */
    void createDatabase() throws SQLException;

    /**
     * Deletes the database
     * @throws SQLException catches any SQL exceptions
     */
    void deleteDatabase() throws SQLException;
}
