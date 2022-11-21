package reservation;


public class Reservation {

    private String nominal;
    private int customerNumber;


    public Reservation(String nominal, int customerNumber ){
        this.nominal = nominal;
        this.customerNumber = customerNumber;
    }

    //Setters and Getters
    public String getNominal() {
        return nominal;
    }

    public void setNominal(String nominal) {
        this.nominal = nominal;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }
}
