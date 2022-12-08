package restaurant;

import enumerations.TableStatusEnum;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Alina Mustata
 * The Restaurant class
 */
public class Restaurant {

    private  Map<Table, Reservation> tableMap = new HashMap<>();

    //TODO inserire tutti i field che servono per creare un ristorante
    private String nomeRistorante;

    /**
     * Instantiates a new Restaurant
     * Assigns the tables from the tableList to the key of the tableMap
     *
     * @param tableList the table list of the restaurant
     */
    public Restaurant(List<Table> tableList){
        // TODO rivedere

        for(Table table : tableList){
            tableMap.put(table,null);
        }
    }

    /**
     * Reserves a table
     * Iterates the map tableMap : key is the Table object, value is the Reservation object
     * Checks if the table status is Available and the table number of seats is greater than the required seats
     * If this is true then creates a new Reservation with the input parameters, the map value reservation is
     * set as the new reservation and the status of the table is set to Reserved
     *
     //* @param reservationName the reservation name
     //* @param requiredSeats   the required seats
     * @param date            the date
     * @param time            the time
     * @return the table reserved in case of available tables with enough seats
     *         null in case of no available tables or tables with not enough seats
     */
    public void reserveTable(Table table, LocalDate date, LocalTime time){
/*
        for(Map.Entry<Table, Reservation> entry : tableMap.entrySet()){
            if (entry.getKey().getTableStatus() == TableStatusEnum.AVAILABLE
                    && entry.getKey().getTableSeats() >= requiredSeats){
                entry.setValue(new Reservation(reservationName, requiredSeats, date, time));
                entry.getKey().setTableStatus(TableStatusEnum.RESERVED);
                return entry.getKey();
            }
        }
        System.out.println("No available table for " + reservationName);
        //TODO non dobbiamo mai far tornare null ai metodi

        return null;

 */
        // TODO questo metodo ci prenota un tavolo e stampa lo stato attuale
        // if (table è libero

    }

    /**
     * Empty table
     * Iterates the map tableMap : key is the Table object, value is the Reservation object
     * Checks if the input parameter reservationName exists and is assigned to a table,
     * then sets the map value (reservation) to null and the table status to Available
     * If there is no reservation with that name prints the message :
     *  reservationName is not dinning in this restaurant!
     *
     * @param reservationName the reservation name
     */
    public void emptyTable(String reservationName) {
        for (Map.Entry<Table, Reservation> entry : tableMap.entrySet()) {
            if (entry.getValue() != null && reservationName.equals(entry.getValue().getReservationName())) {
                entry.setValue(null);
                entry.getKey().setTableStatus(TableStatusEnum.AVAILABLE);
                return;
            }
        }
        System.out.println(reservationName + " is not dinning in this restaurant!");
    }

    /**
     * Prints the restaurant details : list of tables with reservation details
     * key = Table object, value = Reservation object
     * If the table has no reservation it prints "Available" instead of the reservation details
     */
    public void printRestaurant(){
        System.out.println("--------------");
        tableMap.forEach((key,value)-> {
            if(value == null){
                System.out.println(key + " *** " + "Available");
            }else {
                System.out.println(key + " *** " + value);
            }
        });
    }


}
