import java.util.ArrayList;

public class ConferenceRoom {

    private String name;
    private int capacity;
    private boolean hasProjector;
    private ArrayList<Guest> guests;

    public ConferenceRoom(String name, int capacity, boolean hasProjector){
        this.name = name;
        this.capacity = capacity;
        this.hasProjector = hasProjector;
        this.guests = new ArrayList<Guest>();
    }

    public String getName() {
        return this.name;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public boolean checkHasProjector() {
        return this.hasProjector;
    }

    public int numOfGuests() {
        return  this.guests.size();
    }

    public void addGuest(Guest guest) {
        if (!isFull()){
            this.guests.add(guest);
        }
    }

    private boolean isFull(){
        return (this.capacity == numOfGuests());
    }

    public void removeGuest(Guest guest) {
        this.guests.remove(guest);
    }
}
