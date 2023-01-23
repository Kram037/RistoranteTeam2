package it.restaurantSite.databaseInterface;


import java.sql.SQLException;

public interface IDatabaseCreate extends IDatabaseDataPath{
    /**
     * Creates a database SQL schema
     * @throws SQLException catches any SQL exceptions
     */
    void createDatabaseSchema() throws SQLException;

    /**
     * Deletes the database
     * @throws SQLException catches any SQL exceptions
     */
    void deleteDatabaseSchema() throws SQLException;

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

}
