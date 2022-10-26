import entities.Desserts;
import entities.Menu;
import entities.Drinks;

public class Start {

    public static void main(String[] args) {

        Menu menu = new Menu();


        menu.addDrink(new Drinks("Acqua Ferragni", " ", 7.50));

        menu.addDessert(new Desserts("Crema catalana", "Latte, uova, zucchero, limone, cannella, amido di mais (maizena), zucchero di canna.", 10.50));
        menu.addDessert(new Desserts("Budino al cioccolato con foglia oro", "Latte intero, cioccolato fondente, zucchero, burro, amido di mais (maizena)", 25.00));
        menu.addDessert(new Desserts("Macedonia di frutta fresca, freschissima", "Banana, kiwi, fragole, mela verde, mandarino", 5));

        menu.getMenu(); //spostato per chiamare tutto il menu completo, scrivete sopra!!
    }
}
