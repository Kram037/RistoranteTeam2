package entities;
import java.util.ArrayList;
import java.util.List;

public class Menu {

    private static final Menu menu = new Menu();

    private final String restaurantName = "I Secondini";

    private static List<DishMenu<?>> dishMenus = new ArrayList<>();

    private Menu(){}

    public static Menu getInstance(){
        return menu;
    }

    public void addDishMenu(DishMenu<?> dishMenu){
        dishMenus.add(dishMenu);
    }

    public void printMenu(){

        System.out.println(restaurantName);

        for(DishMenu<?> dishMenu : dishMenus){
            dishMenu.printDishMenu();
        }

    }

}
