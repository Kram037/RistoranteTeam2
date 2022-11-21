package reservation;

import Enumerations.TableStatusEnum;

public class Table {

    private int tableNumber;
    private int maxSeats;
    private TableStatusEnum status;

    public Table(int tableNumber, int maxSeats, TableStatusEnum status){
        this.tableNumber = tableNumber;
        this.maxSeats = maxSeats;
        this.status = status;
    }

    //Setters and Getters
    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public int getMaxSeats() {
        return maxSeats;
    }

    public void setMaxSeats(int maxSeats) {
        this.maxSeats = maxSeats;
    }

    public TableStatusEnum getStatus() {
        return status;
    }

    public void setStatus(TableStatusEnum status) {
        this.status = status;
    }
}
