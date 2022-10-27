package entities;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Menu {
     
    private String restaurantName;
    
    private List<Dish> appetizers = new ArrayList<>();
    private List<Dish> mainCourses = new ArrayList<>();
    private List<Dish> secondCourses = new ArrayList<>();
    private List<Dish> desserts = new ArrayList<>();
    private List<Dish> drinks = new ArrayList<>();
 
    public Menu(){
        this.restaurantName = "I Secondini";
    }
 
    public void addAppetizer(Appetizers appetizer){
       appetizers.add(appetizer);
    }
 
    public void addMainCourse(MainCourses mainCourse){
       mainCourses.add(mainCourse);
    }
 
     public void addSecondCourse(SecondCourses secondCourse){
       secondCourses.add(secondCourse);
    }
 
     public void addDessert(Desserts dessert){
       desserts.add(dessert);
    }
 
     public void addDrink(Drinks drink){
       drinks.add(drink);
    }

    public String printDish(List<Dish> list){
        StringBuilder builder = new StringBuilder();
        for (Dish value : list) {
            builder.append(value);
        }
        String text = builder.toString();

        return text;
    }

    public void getMenu(){

        System.out.println(" *** " + restaurantName.toUpperCase() + " *** " +
                "\n\nAPPETIZERS: " + printDish(appetizers) + "\n\n***********************************************\n" +
                "\nMAIN COURSES: " + printDish(mainCourses) + "\n\n***********************************************\n" +
                "\nSECOND COURSES: " + printDish(secondCourses) + "\n\n***********************************************\n" +
                "\nDESSERTS: " + printDish(desserts) + "\n\n***********************************************\n" +
                "\nDRINKS: " + printDish(drinks));

    }


}
