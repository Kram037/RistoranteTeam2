package entities;

public class MenuAppetizers extends Menu{

    public MenuAppetizers(String name, String ingredients, double price) {
        super(name, ingredients, price);
    }

    public void getAppetizers(){
        System.out.println("Appetizer: " + name +
                            " - Ingredients: " + this.ingredients +
                            " - €" + price );
    }
}
