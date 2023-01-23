package it.restaurantSite.business;

import it.restaurantSite.restaurant.Table;
import it.restaurantSite.entities.Dish;

import java.util.ArrayList;
import java.util.List;


/**
 * Class to make bills for customers
 *
 * @author TonyF
 */
public class Bill{
    private Table table;
    List<Dish> dishesList;
    private double total;

    public Bill(){
    }

    public Bill(Table table){
        this.table = table;
        this.total = 0;
        this.dishesList = new ArrayList<>(0);
    }

    public Table getTable(){
        return table;
    }

    public void setTable(Table table){
        this.table = table;
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
        System.out.println("The bill for the "+table.getId()+":");
        for (Dish single : dishesList){
            System.out.println(single.getName()+" "+single.getPrice()+" €");
            total += single.getPrice();
        }
        System.out.println("The total is "+total+" €");
    }

}


