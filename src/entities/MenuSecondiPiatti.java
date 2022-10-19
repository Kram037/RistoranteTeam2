package entities;

public class MenuSecondiPiatti extends Menu{
    //Constructor method extends the constructor Menu
    public MenuSecondiPiatti(String name, String ingredients, double price){
        super(name, ingredients, price);
    }
    //Add a method to print the details
    public void getSecondiPiatti(){
        System.out.println("Plate name: " + this.name + " |ingredients: " + this.ingredients +
                "  |€" + this.price);
    }

}
