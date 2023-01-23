import it.restaurantSite.customer.Customer;
import it.restaurantSite.entities.*;
import it.restaurantSite.enumerations.FoodPreferencesEnum;
import it.restaurantSite.business.Bill;
import it.restaurantSite.restaurant.Reservation;
import it.restaurantSite.restaurant.Restaurant;
import it.restaurantSite.restaurant.Table;

import java.sql.SQLException;


/**
 * The type Start.
 */
public class Start{
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args){
        Restaurant restaurant = Restaurant.getInstance();
        Menu menu = Menu.getInstance();

        Dish drink1 = new Drinks("Acqua Ferragni","Water",7.50,FoodPreferencesEnum.VEGAN);
        Dish drink2 = new Drinks("Barbera","Red Wine",15,FoodPreferencesEnum.VEGETARIAN);
        Dish drink3 = new Drinks("CocaCola","Water, sugar, food preservative, secret recipe",15,
                FoodPreferencesEnum.VEGETARIAN);




        Dish appetizer1 = new Appetizers("Bruschetta","Bread, tomatoes, olive oil, garlic",5,FoodPreferencesEnum.VEGAN);
        Dish appetizer2 = new Appetizers("Chips and Dips","Potatoes, sunflower oil, mayo, ketchup",3,
                FoodPreferencesEnum.VEGETARIAN);
        Dish appetizer3 = new Appetizers("Shrimp Cocktail","Shrimp, mayo, ketchup, salt",10,
                FoodPreferencesEnum.FULL_MENU);



        Dish mainCourse1 = new MainCourses("Seafood linguine","Linguine, seafood",12,FoodPreferencesEnum.FULL_MENU);
        Dish mainCourse2 = new MainCourses("Carbonara",
                "Spaghetti, eggs, guanciale, black pepper, pecorino/parmesan cheese",8,FoodPreferencesEnum.FULL_MENU);
        Dish mainCourse3 = new MainCourses("Gnocchetti alla bava","Potatoes gnocchi, cheese cream",10,
                FoodPreferencesEnum.VEGETARIAN);


        Dish secondCourse1 = new SecondCourses("Florentine steak","Italian meat I.G.P.",50.00,
                FoodPreferencesEnum.FULL_MENU);
        Dish secondCourse2 = new SecondCourses("Granny s cutlet","Lots of love",5.00,FoodPreferencesEnum.FULL_MENU);
        Dish secondCourse3 = new SecondCourses("Meat stew","Secret ingredients",8.00,FoodPreferencesEnum.FULL_MENU);




        Dish dessert1 = new Desserts("Catalan cream","Milk, eggs, sugar, lemon, cinnamon, cornstarch, brown sugar",
                10.50,FoodPreferencesEnum.VEGETARIAN);
        Dish dessert2 = new Desserts("Chocolate pudding","Milk, dark chocolate, sugar, butter, cornstarch",25.00,
                FoodPreferencesEnum.VEGETARIAN);
        Dish dessert3 = new Desserts("Fresh fruit salad, super fresh",
                "Banana, kiwi, strawberries, green apple, tangerine",5,FoodPreferencesEnum.VEGAN);


        Customer pippo = new Customer("Pippo","pippo@gmail.com","pippo", FoodPreferencesEnum.FULL_MENU);
        Customer pluto = new Customer("Pluto","plutoo@gmail.com","pluto", FoodPreferencesEnum.FULL_MENU);
        Customer paperino = new Customer("Paperino","paperinoo@gmail.com","paperino", FoodPreferencesEnum.VEGAN);
        Customer micky = new Customer("Micky","micky@gmail.com", "micky",FoodPreferencesEnum.FULL_MENU);
        Customer minnie = new Customer("Minnie","minnie@gmail.com","minnie", FoodPreferencesEnum.FULL_MENU);
        Customer daisy = new Customer("Daisy","daisy@gmail.com", "daisy",FoodPreferencesEnum.FULL_MENU);

        Table table1 = new Table("Table 1",4);



        Reservation reservation1 = new Reservation("reservation1",5);

        Bill bill1 = new Bill(table1);
        bill1.addDishAToTheBill(secondCourse1);
        bill1.addDishAToTheBill(secondCourse3);
        bill1.addDishAToTheBill(secondCourse2);
        bill1.addDishAToTheBill(appetizer1);
        bill1.addDishAToTheBill(drink1);

        bill1.printTheBill();





        try{
                pippo.createDatabaseTables();
                //pippo.insertNewRow();
                //pippo.infoCustomer();
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
        //databaseSelect.printDishesInfo();
    }
}
