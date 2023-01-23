package it.restaurantSite.databaseUtilities;


import java.sql.SQLException;

public abstract class DatabaseUpdate extends DatabaseConnection{
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
