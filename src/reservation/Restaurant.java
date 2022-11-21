package reservation;
import Enumerations.TableStatusEnum;

import java.util.HashMap;
import java.util.Map;

public class Restaurant {
    private static final Restaurant restaurant = new Restaurant();
    public Map<Reservation, Table> myReservation = new HashMap<>();
    private Restaurant(){}

    /**
     * add method with a control statement
     * @param reservation
     * @param table
     */
    public void addTable(Reservation reservation, Table table) {
        if (table.getStatus() == TableStatusEnum.AVAILABLE && reservation.getCustomerNumber() <= table.getMaxSeats()){
            myReservation.put(reservation, table);
            table.setStatus(TableStatusEnum.OCCUPIED);
            System.out.println("Add reservation " + reservation.getNominal() + " to table n." + table.getTableNumber());
        }else{
            System.out.println("The table n." + table.getTableNumber() + " is already OCCUPIED or not match condition");
        }
    }

    /**
     * remove method with a control statement
     * @param reservation
     * @param table
     */
    public void removeTable(Reservation reservation, Table table){
        if(table.getStatus() == TableStatusEnum.AVAILABLE){
            System.out.println("The table n." + table.getTableNumber() + " is already AVAILABLE");
        }else{
            myReservation.remove(reservation, table);
            table.setStatus(TableStatusEnum.AVAILABLE);
            System.out.println("Table n." + table.getTableNumber() + " is now AVAILABLE!");
        }
    }

    public void restaurantDetails(){
        myReservation.forEach((reservation, table) -> {
            System.out.println("Reservation : " + reservation.getNominal() + " Table n." + table.getTableNumber());
        });
    }
    public static Restaurant getInstance(){return restaurant;}
}
