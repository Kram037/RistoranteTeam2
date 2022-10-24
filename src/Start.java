import entities.Menu;
import entities.MenuDolci;
import entities.MenuAppetizers;
import entities.Drinks;

public class Start {

    public static void main(String[] args) {

        Menu menu = new Menu();


        menu.addDrink(new Drinks("Acqua Ferragni", " ", 7.50));
        menu.getMenu();
        
    }
}
