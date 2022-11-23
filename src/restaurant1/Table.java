package restaurant1;

public class Table {
    private final int tableNumber;

    public Table(int tableNumber){
        this.tableNumber = tableNumber;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    @Override
    public String toString() {
        return "Table{" +
                "tableNumber=" + tableNumber +
                '}';
    }
}
