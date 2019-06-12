import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {

    private String name;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(String name){
        this.name = name;
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
    }

    public String getName() {
        return this.name;
    }

    public void addBedroom(Bedroom bedroom) {
        this.bedrooms.add(bedroom);
    }

    public int numOfBedrooms() {
        return this.bedrooms.size();
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom) {
        this.conferenceRooms.add(conferenceRoom);
    }

    public int numOfConferenceRooms(){
        return this.conferenceRooms.size();
    }

    public void checkInGuestToBedroom(Bedroom bedroom, Guest guest) {
        bedroom.addGuest(guest);
    }

    public void checkOutGuestFromBedroom(Bedroom bedroom, Guest guest) {
        bedroom.removeGuest(guest);
    }
}
