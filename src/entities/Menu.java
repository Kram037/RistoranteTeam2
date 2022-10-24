package entities;
import java.util.List;

public class Menu {
     
    private String restaurantName;
    
    private List<Dish> appetizers;
    private List<Dish> mainCourses;
    private List<Dish> secondCourses;
    private List<Dish> desserts;
    private List<Dish> drinks;
 
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
 
 
    public void getMenu(){
        
        System.out.println(restaurantName + " " + appetizers + " " + mainCourses + " " + secondCourses
                + " " + desserts + " " + drinks);

    }
 
}
