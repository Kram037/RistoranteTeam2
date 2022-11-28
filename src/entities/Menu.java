package entities;
import customer.Customer;
import enumerations.FoodPreferencesEnum;

import java.util.ArrayList;
import java.util.List;

/**
 * The Singleton used for instantiate the menu.
 */
public class Menu {

    private static final Menu menu = new Menu();

    private final String restaurantName = "I Secondini";

    private static List<Course> courseList = new ArrayList<>();

    private Menu(){}

    /**
     * Get the instance of the menu.
     *
     * @return the instance menu.
     */
    public static Menu getInstance(){
        return menu;
    }

    /**
     * Add all the dishes lists to the courseList.
     *
     * @param courseList the list of the dishes.
     */
    public void addDishMenu(Course courseList){
        //TODO sistemare
        Menu.courseList.add(courseList);
    }

    /**
     * Print the entire menu.
     */
    public void printMenu(){

        System.out.println("\n" + restaurantName);

        for(Course dishMenu : courseList){
            dishMenu.printCourse();
        }
    }

    public void printPreferencedMenu(Customer customer) {

        if (customer.getFoodPreference() == FoodPreferencesEnum.FULL_MENU) {
            printMenu();
        } else {
            System.out.println("\n" + restaurantName);
            System.out.println("Menu " + customer.getFoodPreference().toString().toLowerCase());

            for (Course dishMenu : courseList) {
                dishMenu.printPreferencedCourse(customer);
            }
        }
    }
}
