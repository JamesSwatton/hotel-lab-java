import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {

    private String name;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private Booking newBooking;

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

    public void checkInGuestToRoom(Room room, Guest guest) {
        room.addGuest(guest);
    }

    public void checkOutGuestFromRoom(Room room, Guest guest) {
        room.removeGuest(guest);
    }


    public Booking bookRoom(Bedroom bedroom, int numOfNights) {
        return newBooking = new Booking(bedroom, numOfNights);
    }
}
