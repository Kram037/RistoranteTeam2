package customer;

public class Restaurant {
    private static final Restaurant restaurant = new Restaurant();
    //add a map to pair reservation with table
    private Restaurant(){}

    public void addTable(){}
    public void removeTable(){}
    private static Restaurant getInstance(){return restaurant;}
}
