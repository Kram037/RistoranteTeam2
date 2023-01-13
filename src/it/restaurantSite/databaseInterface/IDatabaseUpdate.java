package it.restaurantSite.databaseInterface;


import java.sql.SQLException;

public interface IDatabaseUpdate<T> extends IDatabaseDataPath{
    /**
     * Creates a table in the schema which is specified in the url
     * @param tableName the name that the table will have
     * @throws SQLException any SQL exception
     */
    void createTable(String tableName) throws SQLException;

    /**
     * Deletes a table in the schema which is specified in the url
     * @param tableName the table that will be deleted
     * @throws SQLException any SQL exception
     */
    void deleteTable(String tableName)throws SQLException;

    /**
     * Inserts a row in the table
     * @param tableName the name of the table where will be inserted the row
     * @param object generics that will be specified to be inserted into the correct table
     * @throws SQLException any SQL exception
     */
    void insertNewRow(String tableName,T object) throws SQLException;

    /**
     * Deletes a row from the table
     * @param tableName the table where the row will be deleted
     * @param id to specify the id of the row that will be deleted
     * @throws SQLException any SQL exception
     */
    void deleteRow(String tableName,int id) throws SQLException;
}
