package restaurant2;

public class Table2 {
    private final int tableNumber;
    private final int tableSeats;

    public Table2(int tableNumber, int tableSeats){
        this.tableNumber = tableNumber;
        this.tableSeats = tableSeats;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public int getTableSeats() {
        return tableSeats;
    }

    @Override
    public String toString() {
        return "Table2{" +
                "tableNumber=" + tableNumber +
                ", tableSeats=" + tableSeats +
                '}';
    }
}
