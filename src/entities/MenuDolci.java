package entities;

public class MenuDolci extends Menu{

    public MenuDolci(String name, String ingredients, double price) {
        super(name, ingredients, price);
    }

    public void getDolci(){
        System.out.println(" " + "\nDolce: " + this.name + "  €" + this.price + "\n- " + this.ingredients + " - ");
    }
}
