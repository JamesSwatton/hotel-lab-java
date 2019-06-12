import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom;
    ConferenceRoom conferenceRoom;
    Guest guest;
    Booking booking;

    @Before
    public void before(){
        hotel = new Hotel("Bates");
        bedroom = new Bedroom(1, 2, "single", 50);
        conferenceRoom = new ConferenceRoom("Hazer Suite", 2, true);
        guest = new Guest("Joe");
        hotel.addBedroom(bedroom);
        hotel.addConferenceRoom(conferenceRoom);
        booking = new Booking(bedroom, 7);
    }

    @Test
    public void hasName(){
        assertEquals("Bates", hotel.getName());
    }

    @Test
    public void hasBedrooms(){
        assertEquals(1, hotel.numOfBedrooms());
    }

    @Test
    public void hasConferenceRooms(){
        assertEquals(1, hotel.numOfConferenceRooms());
    }

    @Test
    public void canCheckInGuestToBedroom(){
        hotel.checkInGuestToBedroom(bedroom, guest);
        assertEquals(1, bedroom.getNumberOfGuests());
    }

    @Test
    public void canCheckOutGuestFromBedroom(){
        hotel.checkInGuestToBedroom(bedroom, guest);
        hotel.checkOutGuestFromBedroom(bedroom, guest);
        assertEquals(0, bedroom.getNumberOfGuests());
    }

    @Test
    public void canCheckInGuestToConferenceRoom(){
        hotel.checkInGuestToConferenceRoom(conferenceRoom, guest);
        assertEquals(1, conferenceRoom.numOfGuests());
    }

    @Test
    public void canCheckOutGuestFromConferenceRoom(){
        hotel.checkInGuestToConferenceRoom(conferenceRoom, guest);
        hotel.checkOutGuestFromConferenceRoom(conferenceRoom, guest);
        assertEquals(0, conferenceRoom.numOfGuests());
    }

    @Test
    public void canMakeBooking(){
        assertEquals(booking.getNumOfNights(), hotel.bookRoom(bedroom, 7).getNumOfNights());
    }
}
