package restaurant;

import customer.Customer;
import enumerations.TableStatusEnum;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Alina Mustata
 * The Table class
 */
public class Table {
    private final int tableId;
    private final int tableSeats;
    private TableStatusEnum tableStatus;

    /**
     * Instantiates a new Table
     *
     * @param tableId    the table id
     * @param tableSeats the table number of seats(2,4,6,8...)
     */
    public Table(int tableId, int tableSeats){
        this.tableId = tableId;
        this.tableSeats = tableSeats;
        this.tableStatus = TableStatusEnum.AVAILABLE;
    }

    /**
     * Gets table id
     *
     * @return the table id
     */
    public int getTableId() {
        return tableId;
    }

    /**
     * Gets table number of seats
     *
     * @return the table seats
     */
    public int getTableSeats() {
        return tableSeats;
    }

    /**
     * Gets table status
     *
     * @return the table status(Available, Occupied, Reserved)
     */
    public TableStatusEnum getTableStatus() {
        return tableStatus;
    }

    /**
     * Sets table status(Available, Occupied, Reserved)
     *
     * @param tableStatus the table status
     */
    public void setTableStatus(TableStatusEnum tableStatus) {
        this.tableStatus = tableStatus;
    }


    @Override
    public String toString() {
        return "Table " + tableId + ", size: " + tableSeats + " seats";
    }
}
