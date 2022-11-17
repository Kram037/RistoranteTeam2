package entities;
import java.util.ArrayList;
import java.util.List;

public class Menu {

    private static final Menu menu = new Menu();

    private final String restaurantName = "I Secondini";

    private static List<Course> dishList = new ArrayList<>();

    private Menu(){}

    public static Menu getInstance(){
        return menu;
    }

    public void addDishMenu(Course dish){
        dishList.add(dish);
    }

    public void printMenu(){

        System.out.println(restaurantName);

        for(Course dishMenu : dishList){
            dishMenu.printDishMenu();
        }

    }

}
