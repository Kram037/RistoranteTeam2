package entities;

public class Menu {

    public String name;
    public String ingredients;
    public double price;
    private Menu instance = new Menu();

    private Menu(){}

    protected Menu(String name, String ingredients, double price){
        this.name = name;
        this.ingredients = ingredients;
        this.price = price;
    }

    public static Menu getMenu(){
        return instance;
    }

}
