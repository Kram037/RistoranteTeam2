package restaurant2;

import customer.Customer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Restaurant2 {
    private final Map<Table2, Reservation> tableMap = new HashMap<>();

    public Restaurant2(List<Table2> tableList) {
        for(Table2 table : tableList){
           tableMap.put(table, null);
        }
    }

    public void reserveTable(Customer customer, int requiredSeats){
        for(Map.Entry<Table2, Reservation> entry : tableMap.entrySet()){
           if (entry.getValue() == null && entry.getKey().getTableSeats() >= requiredSeats){
               entry.setValue(new Reservation(customer, requiredSeats));
               return;
           }
        }
        System.out.println("No available table for " + customer.getCustomerName() + " !");
    }

    public void emptyTable(String reservationName) {
        for (Map.Entry<Table2, Reservation> entry : tableMap.entrySet()) {
            if (entry.getValue() != null && reservationName.equals(entry.getValue().getReservationName())) {
                entry.setValue(null);
                return;
            }
        }
        System.out.println(reservationName + " is not dinning in this restaurant!");
    }
    public void emptyTable(Customer customer) {
       emptyTable(customer.getCustomerName());
    }

    public void printRestaurant(){
        System.out.println("--------------");
        tableMap.forEach((key,entry)-> System.out.println(key + " " + entry));
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "tableMap=" + tableMap +
                '}';
    }
}
