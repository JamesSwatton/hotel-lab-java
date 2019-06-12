import java.util.ArrayList;

public class Room {

    private int capacity;
    private ArrayList<Guest> guests;

    public Room(int capacity){
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
    }

    public void addGuest(Guest guest) {
        if (!isFull()) {
            this.guests.add(guest);
        }
    }

    public void removeGuest(Guest guest) {
        this.guests.remove(guest);
    }

    public boolean isFull(){
        return (this.capacity == this.getNumberOfGuests());
    }

    public boolean isEmpty(){
        return (this.getNumberOfGuests() == 0);
    }


    public int getNumberOfGuests() {
        return this.guests.size();
    }

    public int getCapacity() {
        return this.capacity;
    }
}
