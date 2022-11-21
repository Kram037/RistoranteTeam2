import Entities.Enumerations.DishType;
import Entities.Enumerations.FoodPreferencesEnum;
import Entities.*;

public class Start {

    public static void main(String[] args) {

        Menu menu = Menu.getInstance();

        //---
        Dish drink1 = new Drinks("Acqua Ferragni", "Water", 7.50, FoodPreferencesEnum.VEGAN, DishType.DRINK);
        Dish drink2 = new Drinks("Barbera", "Red Wine", 15, FoodPreferencesEnum.VEGETARIAN, DishType.DRINK);
        Dish drink3 = new Drinks("CocaCola", "Water, sugar, food preservative, secret recipe", 15, FoodPreferencesEnum.VEGETARIAN, DishType.DRINK);

        Course drinksList = new Course();
        drinksList.addDish(drink1);
        drinksList.addDish(drink2);
        drinksList.addDish(drink3);
        menu.addDishMenu(drinksList);

        //----
        Dish appetizer1 = new Appetizers("Bruschetta", "Bread, tomatoes, olive oil, garlic", 5, FoodPreferencesEnum.VEGAN, DishType.APPETIZER);
        Dish appetizer2 = new Appetizers("Chips and Dips", "Potatoes, sunflower oil, mayo, ketchup", 3, FoodPreferencesEnum.VEGETARIAN, DishType.APPETIZER);
        Dish appetizer3 = new Appetizers("Shrimp Cocktail", "Shrimp, mayo, ketchup, salt", 10, FoodPreferencesEnum.DEFAULT, DishType.APPETIZER);

        Course appetizersList = new Course();
        appetizersList.addDish(appetizer1);
        appetizersList.addDish(appetizer2);
        appetizersList.addDish(appetizer3);
        menu.addDishMenu(appetizersList);

        //----
        Dish mainCourse1 = new MainCourses("Seafood linguine", "Linguine, seafood", 12, FoodPreferencesEnum.DEFAULT, DishType.MAINCOURSE);
        Dish mainCourse2 = new MainCourses("Carbonara", "Spaghetti, eggs, guanciale, black pepper, pecorino/parmesan cheese", 8, FoodPreferencesEnum.DEFAULT, DishType.MAINCOURSE);
        Dish mainCourse3 = new MainCourses("Gnocchetti alla bava", "Potatoes gnocchi, cheese cream", 10, FoodPreferencesEnum.VEGETARIAN, DishType.MAINCOURSE);

        Course mainCoursesList = new Course();
        mainCoursesList.addDish(mainCourse1);
        mainCoursesList.addDish(mainCourse2);
        mainCoursesList.addDish(mainCourse3);
        menu.addDishMenu(mainCoursesList);

        //----
        Dish secondCourse1 = new SecondCourses("Florentine steak", "Italian meat I.G.P.", 50.00, FoodPreferencesEnum.DEFAULT, DishType.SECONDCOURSE);
        Dish secondCourse2 = new SecondCourses("Granny's cutlet", "Lots of love", 5.00, FoodPreferencesEnum.DEFAULT, DishType.SECONDCOURSE);
        Dish secondCourse3 = new SecondCourses("Meat stew", "Secret ingredients", 8.00, FoodPreferencesEnum.DEFAULT, DishType.SECONDCOURSE);

        Course secondCoursesList = new Course();
        secondCoursesList.addDish(secondCourse1);
        secondCoursesList.addDish(secondCourse2);
        secondCoursesList.addDish(secondCourse3);
        menu.addDishMenu(secondCoursesList);

        //----
        Dish dessert1 = new Desserts("Catalan cream", "Milk, eggs, sugar, lemon, cinnamon, cornstarch, brown sugar", 10.50, FoodPreferencesEnum.VEGETARIAN, DishType.DESSERT);
        Dish dessert2 = new Desserts("Chocolate pudding", "Milk, dark chocolate, sugar, butter, cornstarch", 25.00, FoodPreferencesEnum.VEGETARIAN, DishType.DESSERT);
        Dish dessert3 = new Desserts("Fresh fruit salad, super fresh", "Banana, kiwi, strawberries, green apple, tangerine", 5, FoodPreferencesEnum.VEGAN, DishType.DESSERT);

        Course dessertsList = new Course();
        dessertsList.addDish(dessert1);
        dessertsList.addDish(dessert2);
        dessertsList.addDish(dessert3);
        menu.addDishMenu(dessertsList);


        menu.printMenu();
    }
}
