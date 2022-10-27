import entities.*;

public class Start {

    public static void main(String[] args) {

        Menu menu = new Menu();


        menu.addDrink(new Drinks("Acqua Ferragni", "Water", 7.50));
        menu.addDrink(new Drinks("Barbera", "Red Wine", 15));
        menu.addDrink(new Drinks("CocaCola", "Water, sugar, food preservative, secret recipe", 15));

        menu.addAppetizer(new Appetizers("Bruschetta", "Bread, tomatoes, olive oil, garlic", 5));
        menu.addAppetizer(new Appetizers("Chips and Dips", "Potatoes, sunflower oil, mayo, ketchup", 3));
        menu.addAppetizer(new Appetizers("Shrimp Cocktail", "Shrimp, mayo, ketchup, salt", 10));

        menu.addMainCourse(new MainCourses("Seafood linguine", "Linguine, seafood", 12));
        menu.addMainCourse(new MainCourses("Carbonara", "Spaghetti, eggs, guanciale, black pepper, pecorino/parmesan cheese", 8));
        menu.addMainCourse(new MainCourses("Gnocchetti alla bava", "Potatoes gnocchi, cheese cream", 10));

        menu.addSecondCourse(new SecondCourses("Florentine steak", "Italian meat I.G.P.", 50.00));
        menu.addSecondCourse(new SecondCourses("Granny's cutlet", "Lots of love", 5.00));
        menu.addSecondCourse(new SecondCourses("Meat stew", "Secret ingredients", 8.00));

        menu.addDessert(new Desserts("Catalan cream", "Milk, eggs, sugar, lemon, cinnamon, cornstarch, brown sugar", 10.50));
        menu.addDessert(new Desserts("Chocolate pudding", "Milk, dark chocolate, sugar, butter, cornstarch", 25.00));
        menu.addDessert(new Desserts("Fresh fruit salad, super fresh", "Banana, kiwi, strawberries, green apple, tangerine", 5));

        menu.getMenu();
    }
}
