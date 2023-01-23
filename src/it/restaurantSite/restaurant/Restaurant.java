package it.restaurantSite.restaurant;

import it.restaurantSite.databaseInterface.IDatabaseCreate;
import it.restaurantSite.enumerations.TableStatusEnum;

import java.util.HashMap;
import java.util.Map;

/**
 * The class Restaurant.
 */
public class Restaurant {

    private static Restaurant restaurant = new Restaurant();
    private Map<Table, Reservation> myRestaurant = new HashMap<>();

    private Restaurant() {
    }

    /**
     * Gets instance of the it.restaurantSite.restaurant singleton.
     *
     * @return the instance
     */
    public static Restaurant getInstance() {
        return restaurant;
    }

    /**
     * Gets my it.restaurantSite.restaurant map.
     *
     * @return the it.restaurantSite.restaurant
     */
    public Map<Table, Reservation> getMyRestaurant() {
        return myRestaurant;
    }

    /**
     * A method to reserve tables that checks the table state and the table available seats
     * adds table and reservation to the it.restaurantSite.restaurant map
     * modifies the table state and available seats
     *
     * @param table       the table
     * @param reservation the reservation
     */
    public void reserveTable(Table table, Reservation reservation){
        if(table.getTableState() == TableStatusEnum.OCCUPIED){
            System.out.println("Error : the requested table is already occupied by other customers");
        } else if(( table.getInitialSeats() >= reservation.getRequiredSeats() )){
            myRestaurant.put(table,reservation);
            table.setTableState(TableStatusEnum.OCCUPIED);
            table.setAvailableSeats(table.getInitialSeats() - reservation.getRequiredSeats());
            System.out.println("è stato riservato");
        } else {
            System.out.println("There aren't enough available seats for this reservation");
        }
    }

    /**
     * A method to clean tables that checks the table state
     * removes table and reservation from the it.restaurantSite.restaurant map
     * modifies the table state
     * @param table       the table
     * @param reservation the reservation
     * @return the reservation
     */
    public void cleanTable(Table table, Reservation reservation) {
        if (table.getTableState() == TableStatusEnum.AVAILABLE) {
            System.out.println("Error : the requested table had already been freed and cleaned");
        }
        else {
            myRestaurant.remove(table, reservation);
            table.setTableState(TableStatusEnum.AVAILABLE);
            table.setAvailableSeats(table.getInitialSeats());
        }
    }

    /**
     * Iterates through the it.restaurantSite.restaurant map and prints the details of the table, reservation and customers.
     */
    public void printRestaurantInfo() {
        restaurant.getMyRestaurant().forEach((table, reservation) -> System.out.println(table.getName() +
                " is " + table.getTableState().toString().toLowerCase() +
                " by reservation : " + reservation.getReservationInfo()));
    }


}