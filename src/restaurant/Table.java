package restaurant;
import enumerations.TableStatusEnum;

/**
 * The class Table.
 */
public class Table {
    private String name;
    private int initialSeats;
    private int availableSeats;
    private TableStatusEnum tableState;

    /**
     * Instantiates a new Table.
     *
     * @param name  the name
     * @param initialSeats the seats
     */
    public Table(String name,int initialSeats) {
        this.name = name;
        this.initialSeats = initialSeats;
        this.availableSeats = initialSeats;
        this.tableState = TableStatusEnum.AVAILABLE;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets seats.
     *
     * @return the seats
     */
    public int getInitialSeats() {
        return initialSeats;
    }

    /**
     * Gets available seats.
     *
     * @return the available seats
     */
    public int getAvailableSeats() {
        return availableSeats;
    }

    /**
     * Gets table state.
     *
     * @return the table state
     */
    public TableStatusEnum getTableState() {
        return tableState;
    }

    /**
     * method to free tables that changes table state to free and resets the available seats.
     */
    //TODO spostare logica nel restaurant
    public void freeTable(){
        this.tableState = TableStatusEnum.AVAILABLE;
        this.availableSeats = this.initialSeats;
    }

    /**
     * method to reserve tables that calculates available seats and sets the table state to occupied.
     * @param requiredSeats the required seats
     */
    //TODO sistemare il bug
    public void reserveTable(int requiredSeats){
        this.availableSeats = initialSeats - requiredSeats;
        this.tableState = TableStatusEnum.OCCUPIED;
    }

}