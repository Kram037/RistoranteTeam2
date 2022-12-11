package restaurant;
public class Reservation {
    private final String nominal;
    private int requiredSeats;


    /**
     * Instantiates a new Reservation with an already created customer list
     *
     * @param nominal the reservation id
     * @param requiredSeats  the required seats
     */
    public Reservation(String nominal, int requiredSeats) {
        this.nominal = nominal;
        this.requiredSeats = requiredSeats;
    }

    /**
     * Gets reservation id.
     *
     * @return the reservation id
     */
    public String getNominal() {
        return nominal;
    }


    /**
     * Gets required seats.
     *
     * @return the required seats
     */
    public int getRequiredSeats() {
        return requiredSeats;
    }

    /**
     * Sets required seats.
     *
     * @param requiredSeats the required seats
     */
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
