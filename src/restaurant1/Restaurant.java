package restaurant1;

import customer.Customer;
import java.util.HashMap;
import java.util.Map;

public class Restaurant {
    private final Map<Table, Customer> tableMap = new HashMap<>();

    public Restaurant(int numberTables) {
        for(int i = 1; i <= numberTables; i++){
            tableMap.put(new Table(i), null);
        }
    }

    public void reserveTable(Customer customer){
        for(Map.Entry<Table, Customer> entry : tableMap.entrySet()){
           if (entry.getValue() == null){
               entry.setValue(customer);
               return;
           }
        }
        System.out.println("No available table for " + customer + " !");
    }

    public void emptyTable(Customer customer) {
        for (Map.Entry<Table, Customer> entry : tableMap.entrySet()) {
            if (entry.getValue().equals(customer)) {
                entry.setValue(null);
                return;
            }
        }
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
