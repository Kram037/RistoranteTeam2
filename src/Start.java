import entities.*;

public class Start {

    public static void main(String[] args) {

        Menu menu = Menu.getInstance();

        Dish drink = new Drinks("Acqua Ferragni", "Water", 7.50, FoodPreferences.VEGAN);
        Dish drink2 = new Drinks("Acqua Ferragni", "Water", 7.50, FoodPreferences.VEGAN);
        Dish drink3 = new Drinks("Acqua Ferragni", "Water", 7.50, FoodPreferences.VEGAN);


        DishMenu drinksList = new DishMenu();
        drinksList.addDish(drink);
        drinksList.addDish(drink2);
        drinksList.addDish(drink3);
        menu.addDishMenu(drinksList);

        DishMenu<Appetizers> appetizersList = new DishMenu();
        appetizersList.addDish(new Appetizers("Bruschetta", "Bread, tomatoes, olive oil, garlic", 5, FoodPreferences.VEGAN));
        appetizersList.addDish(new Appetizers("Chips and Dips", "Potatoes, sunflower oil, mayo, ketchup", 3, FoodPreferences.VEGETARIAN));
        appetizersList.addDish(new Appetizers("Shrimp Cocktail", "Shrimp, mayo, ketchup, salt", 10, FoodPreferences.DEFAULT));
        menu.addDishMenu(appetizersList);

        DishMenu<MainCourses> mainCoursesList = new DishMenu();
        mainCoursesList.addDish(new MainCourses("Seafood linguine", "Linguine, seafood", 12, FoodPreferences.DEFAULT));
        mainCoursesList.addDish(new MainCourses("Carbonara", "Spaghetti, eggs, guanciale, black pepper, pecorino/parmesan cheese", 8, FoodPreferences.DEFAULT));
        mainCoursesList.addDish(new MainCourses("Gnocchetti alla bava", "Potatoes gnocchi, cheese cream", 10, FoodPreferences.VEGETARIAN));
        menu.addDishMenu(mainCoursesList);

        DishMenu<SecondCourses> secondCoursesList = new DishMenu();
        secondCoursesList.addDish(new SecondCourses("Florentine steak", "Italian meat I.G.P.", 50.00, FoodPreferences.DEFAULT));
        secondCoursesList.addDish(new SecondCourses("Granny's cutlet", "Lots of love", 5.00, FoodPreferences.DEFAULT));
        secondCoursesList.addDish(new SecondCourses("Meat stew", "Secret ingredients", 8.00, FoodPreferences.DEFAULT));
        menu.addDishMenu(secondCoursesList);

        DishMenu<Desserts> dessertsList = new DishMenu();
        dessertsList.addDish(new Desserts("Catalan cream", "Milk, eggs, sugar, lemon, cinnamon, cornstarch, brown sugar", 10.50, FoodPreferences.VEGETARIAN));
        dessertsList.addDish(new Desserts("Chocolate pudding", "Milk, dark chocolate, sugar, butter, cornstarch", 25.00, FoodPreferences.VEGETARIAN));
        dessertsList.addDish(new Desserts("Fresh fruit salad, super fresh", "Banana, kiwi, strawberries, green apple, tangerine", 5, FoodPreferences.VEGAN));
        menu.addDishMenu(dessertsList);

        menu.printMenu();
    }
}
