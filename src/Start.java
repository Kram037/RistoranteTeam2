import entities.Appetizers;
import entities.Desserts;
import entities.MainCourses;
import entities.Menu;
import entities.Drinks;

public class Start {

    public static void main(String[] args) {

        Menu menu = new Menu();


        menu.addDrink(new Drinks("Acqua Ferragni", " ", 7.50));
        menu.addDrink(new Drinks("Barbera", "Vino rosso", 15));
        menu.addDrink(new Drinks("CocaCola", "acqua, zucchero, conservanti, ricetta segreta", 15));

        menu.addAppetizer(new Appetizers("Bruschetta", "bread, tomatoes, olive oil, garlic", 5));
        menu.addAppetizer(new Appetizers("Chips and Dips", "potatoes, sunflower oil, mayo, ketchup", 3));
        menu.addAppetizer(new Appetizers("Shrimp Cocktail", "shrimp, mayo, ketchup, salt", 10));

        menu.addMainCourse(new MainCourses("Linguine ai frutti di mare", "linguine e frutti mare", 12));
        menu.addMainCourse(new MainCourses("Carbonara", "spaghetti, uovo, guanciale, pepe e pecorino/parmigiano", 8));
        menu.addMainCourse(new MainCourses("Gnocchetti alla bava", "gnocchi di patate, misto di formaggi", 10));

        menu.addDessert(new Desserts("Crema catalana", "Latte, uova, zucchero, limone, cannella, amido di mais (maizena), zucchero di canna.", 10.50));
        menu.addDessert(new Desserts("Budino al cioccolato con foglia oro", "Latte intero, cioccolato fondente, zucchero, burro, amido di mais (maizena)", 25.00));
        menu.addDessert(new Desserts("Macedonia di frutta fresca, freschissima", "Banana, kiwi, fragole, mela verde, mandarino", 5));


        menu.getMenu(); //spostato per chiamare tutto il menu completo, scrivete sopra!!
    }
}
