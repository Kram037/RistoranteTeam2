package it.buisness;

import entities.Dish;
import restaurant.Reservation;

import java.util.ArrayList;
import java.util.List;

/**
 * Class to make bills for customers
 *
 * @author TonyF
 */
public class Bill{
    private Reservation reservation;
    List<Dish> dishesList;
    private double total;

    public Bill(){
    }

    public Bill(Reservation reservation){
        this.reservation = reservation;
        this.total = 0;
        this.dishesList = new ArrayList<>(0);
    }

    public Reservation getReservation(){
        return reservation;
    }

    public List<Dish> getDishesList(){
        return dishesList;
    }

    public double getTotal(){
        return total;
    }

    public void addDishAToTheBill(Dish dish){
        this.dishesList.add(dish);
    }

    public void cancelTheDishInTheBill(Dish dish){
        this.dishesList.remove(dish);
    }

    /**
     * Iterates the dishesList to print the name and the price of dish and sums the prices to give the total
     */
    public void printTheBill(){
        System.out.println("The bill for the "+reservation+":");
        for (Dish single : dishesList){
            System.out.println(single.getName()+" "+single.getPrice()+" €");
            total += single.getPrice();
        }
        System.out.println("The total is "+total+" €");
    }

}


