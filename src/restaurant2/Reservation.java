package restaurant2;


import customer.Customer;

class Reservation {
    private final Customer customer;
    private final int requiredSeats;

    public Reservation(Customer customer, int requiredSeats) {
        this.customer = customer;
        this.requiredSeats = requiredSeats;
    }

    public String getReservationName() {
        return customer.getCustomerName();
    }

    public int getRequiredSeats() {
        return requiredSeats;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "customer=" + customer +
                ", requiredSeats=" + requiredSeats +
                '}';
    }
}
