package customer;

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
}
