package entities;

public class MenuDrinks extends Menu{


    public MenuDrinks(String name, String ingredients, double price) {
        super(name, ingredients, price);
    }

    public void getDrinks(){
        System.out.println("Drink: " + this.name + "  €" + this.price);
    }

}
