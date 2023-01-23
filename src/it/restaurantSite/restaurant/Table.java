package it.restaurantSite.restaurant;
import it.restaurantSite.enumerations.TableStatusEnum;

/**
 * The class Table.
 */
public class Table {
    private String id;
    private Integer initialSeats;
    private Integer availableSeats;
    private TableStatusEnum tableState;

    /**
     * Instantiates a new Table.
     *
     * @param id  the name
     * @param initialSeats the seats
     */
    public Table(String id, int initialSeats) {
        this.id = id;
        this.initialSeats = initialSeats;
        this.availableSeats = initialSeats;
        this.tableState = TableStatusEnum.AVAILABLE;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getId() {
        return id;
    }

    /**
     * Sets name.
     *
     * @param id the name
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Gets seats.
     *
     * @return the seats
     */
    public Integer getInitialSeats() {
        return initialSeats;
    }

    /**
     * Sets the seats
     * @param initialSeats
     */
    public void setInitialSeats(Integer initialSeats) {
        this.initialSeats = initialSeats;
    }

    /**
     * Gets available seats.
     *
     * @return the available seats
     */
    public Integer getAvailableSeats() {
        return availableSeats;
    }

    /**
     * Sets available seats.
     * @param availableSeats
     */
    public void setAvailableSeats(Integer availableSeats) {
        this.availableSeats = availableSeats;
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
     * Sets table state.
     * @param tableState
     */
    public void setTableState(TableStatusEnum tableState) {
        this.tableState = tableState;
    }

    public String getDetails(){
        return id + " seats "+initialSeats+" avaible seats "+availableSeats+ " state: "+tableState;
    }

}