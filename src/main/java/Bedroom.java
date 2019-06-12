import java.util.ArrayList;

public class Bedroom {

    private int roomNumber;
    private int capacity;
    private ArrayList<Guest> guests;
    private String type;

    public Bedroom(int roomNumber, int capacity, String type){
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.type = type;
        this.guests = new ArrayList<Guest>();
    }


    public int getRoomNumber() {
        return this.roomNumber;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public String getType() {
        return this.type;
    }

    public int getNumberOfGuests() {
        return guests.size();
    }

    public void addGuest(Guest guest) {
        if (!isFull()) {
            this.guests.add(guest);
        }
    }

    public void removeGuest(Guest guest) {
        this.guests.remove(guest);
    }

    private boolean isFull(){
        return (this.capacity == this.getNumberOfGuests());
    }


}
