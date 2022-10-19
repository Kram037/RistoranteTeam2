import entities.MenuDrinks;
import entities.MenuSecondiPiatti;

public class Start {

    public static void main(String[] args) {

        System.out.println("Welcome to 'I Secondini' restaurant");
        //Secondi Piatti
        MenuSecondiPiatti carne = new MenuSecondiPiatti("bistecca", "clienti che si lamentano", 5.00);
        MenuSecondiPiatti pesce = new MenuSecondiPiatti("sgombro", "pesce km0", 15.00);
        MenuSecondiPiatti verdura = new MenuSecondiPiatti("insalata", "erba a volontà", 3.00);

        //Drinks
        MenuDrinks acqua = new MenuDrinks("Acqua Ferragni", " ", 7.50);
        MenuDrinks vino = new MenuDrinks("Barbera", "Uva, acqua", 10.0);
        MenuDrinks cocaCola = new MenuDrinks("CocaCola", "Zucchero, conservanti, 'ricetta segreta'", 5.0);

        carne.getSecondiPiatti();
        pesce.getSecondiPiatti();
        verdura.getSecondiPiatti();

        acqua.getDrinks();
        vino.getDrinks();
        cocaCola.getDrinks();
    }
}
