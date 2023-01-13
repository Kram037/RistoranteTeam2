package it.restaurantSite.restaurant;
public class Reservation {

    private String nominal;
    private Integer requiredSeats;

    /**
     * Instantiates a new Reservation with an already created it.restaurantSite.restaurant.customer list
     *
     * @param nominal the reservation id
     * @param requiredSeats  the required seats
     */
    public Reservation(String nominal, int requiredSeats) {
        this.nominal = nominal;
        this.requiredSeats = requiredSeats;
    }

    //GETTERS AND SETTERS
    public String getNominal() {
        return nominal;
    }

    public Integer getRequiredSeats() {
        return requiredSeats;
    }

    public void setRequiredSeats(int requiredSeats) {
        this.requiredSeats = requiredSeats;
    }

    /**
     * Get reservation info.
     *
     * @return the string
     */
    public String getReservationInfo(){
        return  nominal + " " + requiredSeats;
    }
}
