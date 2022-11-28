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
     * @DEPRECATED @param courseList the list of the dishes.    //fix param in javadoc, see the method below.
     * (remove@DEPRECATED)
     */
    public void addDishMenu(Course course){
        courseList.add(course);
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
