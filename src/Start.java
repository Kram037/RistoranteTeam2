
import customer.Customer;
import entities.*;
import enumerations.FoodPreferencesEnum;
import restaurant1.Restaurant;
import restaurant1.Table;
import restaurant2.Restaurant2;
import restaurant2.Table2;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Start.
 */
public class Start {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        Menu menu = Menu.getInstance();

        Dish drink1 = new Drinks("Acqua Ferragni", "Water", 7.50, FoodPreferencesEnum.VEGAN);
        Dish drink2 = new Drinks("Barbera", "Red Wine", 15, FoodPreferencesEnum.VEGETARIAN);
        Dish drink3 = new Drinks("CocaCola", "Water, sugar, food preservative, secret recipe", 15, FoodPreferencesEnum.VEGETARIAN);

        Course drinksList = new Course();
        drinksList.addDish(drink1);
        drinksList.addDish(drink2);
        drinksList.addDish(drink3);
        menu.addDishMenu(drinksList);


        Dish appetizer1 = new Appetizers("Bruschetta", "Bread, tomatoes, olive oil, garlic", 5, FoodPreferencesEnum.VEGAN);
        Dish appetizer2 = new Appetizers("Chips and Dips", "Potatoes, sunflower oil, mayo, ketchup", 3, FoodPreferencesEnum.VEGETARIAN);
        Dish appetizer3 = new Appetizers("Shrimp Cocktail", "Shrimp, mayo, ketchup, salt", 10, FoodPreferencesEnum.DEFAULT);

        Course appetizersList = new Course();
        appetizersList.addDish(appetizer1);
        appetizersList.addDish(appetizer2);
        appetizersList.addDish(appetizer3);
        menu.addDishMenu(appetizersList);


        Dish mainCourse1 = new MainCourses("Seafood linguine", "Linguine, seafood", 12, FoodPreferencesEnum.DEFAULT);
        Dish mainCourse2 = new MainCourses("Carbonara", "Spaghetti, eggs, guanciale, black pepper, pecorino/parmesan cheese", 8, FoodPreferencesEnum.DEFAULT);
        Dish mainCourse3 = new MainCourses("Gnocchetti alla bava", "Potatoes gnocchi, cheese cream", 10, FoodPreferencesEnum.VEGETARIAN);

        Course mainCoursesList = new Course();
        mainCoursesList.addDish(mainCourse1);
        mainCoursesList.addDish(mainCourse2);
        mainCoursesList.addDish(mainCourse3);
        menu.addDishMenu(mainCoursesList);


        Dish secondCourse1 = new SecondCourses("Florentine steak", "Italian meat I.G.P.", 50.00, FoodPreferencesEnum.DEFAULT);
        Dish secondCourse2 = new SecondCourses("Granny's cutlet", "Lots of love", 5.00, FoodPreferencesEnum.DEFAULT);
        Dish secondCourse3 = new SecondCourses("Meat stew", "Secret ingredients", 8.00, FoodPreferencesEnum.DEFAULT);

        Course secondCoursesList = new Course();
        secondCoursesList.addDish(secondCourse1);
        secondCoursesList.addDish(secondCourse2);
        secondCoursesList.addDish(secondCourse3);
        menu.addDishMenu(secondCoursesList);



        Dish dessert1 = new Desserts("Catalan cream", "Milk, eggs, sugar, lemon, cinnamon, cornstarch, brown sugar", 10.50, FoodPreferencesEnum.VEGETARIAN);
        Dish dessert2 = new Desserts("Chocolate pudding", "Milk, dark chocolate, sugar, butter, cornstarch", 25.00, FoodPreferencesEnum.VEGETARIAN);
        Dish dessert3 = new Desserts("Fresh fruit salad, super fresh", "Banana, kiwi, strawberries, green apple, tangerine", 5, FoodPreferencesEnum.VEGAN);

        Course dessertsList = new Course();
        dessertsList.addDish(dessert1);
        dessertsList.addDish(dessert2);
        dessertsList.addDish(dessert3);
        menu.addDishMenu(dessertsList);


        menu.printMenu();


        //Restaurant restaurant = new Restaurant(5);
        //Customer pippo = new Customer("Pippo" , FoodPreferencesEnum.DEFAULT);
        //Customer pluto = new Customer("Pluto" , FoodPreferencesEnum.DEFAULT);
        //Customer paperino = new Customer("Paperino" , FoodPreferencesEnum.DEFAULT);
        //Customer micky = new Customer("Micky" , FoodPreferencesEnum.DEFAULT);
        //Customer minnie = new Customer("Minnie" , FoodPreferencesEnum.DEFAULT);
        //Customer daisy = new Customer("Daisy" , FoodPreferencesEnum.DEFAULT);

        //restaurant.reserveTable(pippo);
        //restaurant.reserveTable(pluto);
        //restaurant.reserveTable(paperino);
        //restaurant.reserveTable(micky);
        //restaurant.reserveTable(minnie);
        //restaurant.reserveTable(daisy);


        //restaurant.printRestaurant();
        //restaurant.emptyTable(pippo);
        //restaurant.printRestaurant();

        //restaurant.reserveTable(daisy);
        //restaurant.printRestaurant();


        //Customer pippo = new Customer("Pippo" , FoodPreferencesEnum.DEFAULT);
        //Customer pluto = new Customer("Pluto" , FoodPreferencesEnum.DEFAULT);
        //Customer paperino = new Customer("Paperino" , FoodPreferencesEnum.DEFAULT);
        //Customer micky = new Customer("Micky" , FoodPreferencesEnum.DEFAULT);
        //Customer minnie = new Customer("Minnie" , FoodPreferencesEnum.DEFAULT);

        //List<Table2> tableList = new ArrayList<>();
        //tableList.add(new Table2(1,4));
        //tableList.add(new Table2(2,2));
        //tableList.add(new Table2(3,6));
        //tableList.add(new Table2(4,8));

        //Restaurant2 restaurant2 = new Restaurant2(tableList);
        //restaurant2.reserveTable(pippo, 10);
        //restaurant2.reserveTable(pluto, 2);
        //restaurant2.reserveTable(paperino, 4);

        //restaurant2.emptyTable(minnie);
        //restaurant2.printRestaurant();
    }
}
