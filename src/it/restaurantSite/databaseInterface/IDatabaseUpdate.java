package it.restaurantSite.databaseInterface;


import java.sql.SQLException;

public interface IDatabaseUpdate<T> extends IDatabaseDataPath{
    /**
     * Inserts a row in the table
     * @param object generics that will be specified to be inserted into the correct table
     * @throws SQLException catches any SQL exceptions
     */
    void insertDatabaseNewRow(T object) throws SQLException;

    /**
     * Deletes a row from the table
     * @param id to specify the id of the row that will be deleted
     * @throws SQLException catches any SQL exceptions
     */
    void deleteDatabaseRow(int id) throws SQLException;
}
