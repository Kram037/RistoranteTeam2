import entities.MenuDolci;
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

        //Desserts
        MenuDolci budinoCioccolato = new MenuDolci("Budino al cioccolato", "Latte intero, cioccolato fondente, zucchero, burro, amido di mais. Decorazione con scaglie d'oro.", 25.0);
        MenuDolci millefoglie = new MenuDolci("Millefoglie", "Farina 00, sale, zucchero, uova, latte intero, panna fresca liquida, acqua, vaniglia, pasta sfoglia.", 10.50);
        MenuDolci macedoniaFrutta = new MenuDolci("Macedonia di frutta", "Banana, mela rossa, ananas, kiwi, fragole.", 3.50);
        budinoCioccolato.getDolci();
        millefoglie.getDolci();
        macedoniaFrutta.getDolci();

        //Appetizers
        MenuAppetizers chips = new MenuAppetizers("Chips and Dips", "potatoes, oil, mayo, ketchup", 3);
        MenuAppetizers shrimpCocktail = new MenuAppetizers("Shrimp Cocktail", "shrimp, mayo, ketchup", 10);
        MenuAppetizers bruschetta = new MenuAppetizers("Bruschetta", "bread, tomatoes, olive oil, salt, pepper",5);
        chips.getAppetizers();
        shrimpCocktail.getAppetizers();
        bruschetta.getAppetizers();


    }
}
