import entities.MenuAppetizers;
import entities.MenuDrinks;

public class Start {

    public static void main(String[] args) {

        System.out.println("Welcome to 'I Secondini' restaurant");

        //Drinks
        MenuDrinks acqua = new MenuDrinks("Acqua Ferragni", " ", 7.50);
        MenuDrinks vino = new MenuDrinks("Barbera", "Uva, acqua", 10.0);
        MenuDrinks cocaCola = new MenuDrinks("CocaCola", "Zucchero, conservanti, 'ricetta segreta'", 5.0);

        acqua.getDrinks();
        vino.getDrinks();
        cocaCola.getDrinks();

        //Appetizers
        //MenuAppetizers.getMenu();
        MenuAppetizers chips = new MenuAppetizers("Chips and Dips", "potatoes, oil, mayo, ketchup", 5);
        MenuAppetizers shrimpCocktail = new MenuAppetizers("Shrimp Cocktail", "shrimp, mayo, ketchup", 10);

        chips.getAppetizers();
        shrimpCocktail.getAppetizers();

    }
}
