public class Booking {

    private Bedroom bedroom;
    private int numOfNights;

    public Booking(Bedroom bedroom, int numOfNights){
        this.bedroom = bedroom;
        this.numOfNights = numOfNights;
    }


    public int getBedroomNumber() {
        return this.bedroom.getRoomNumber();
    }

    public int getNumOfNights() {
        return this.numOfNights;
    }

    public int calculateTotalBill() {
        return this.numOfNights * this.bedroom.getNightlyRate();
    }
}
