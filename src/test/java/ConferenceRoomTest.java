import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;
    Guest guest;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom("Hazer Suite", 2, true);
        guest = new Guest("Hazy");
    }

    @Test
    public void hasName(){
        assertEquals("Hazer Suite", conferenceRoom.getName());
    }

    @Test
    public void hasCapacity(){
        assertEquals(2, conferenceRoom.getCapacity());
    }

    @Test
    public void hasProjector(){
        assertEquals(true, conferenceRoom.checkHasProjector());
    }

    @Test
    public void canAddGuest(){
        conferenceRoom.addGuest(guest);
        assertEquals(1, conferenceRoom.numOfGuests());
    }

    @Test
    public void cantAddIfAtCapcity(){
        conferenceRoom.addGuest(guest);
        conferenceRoom.addGuest(guest);
        conferenceRoom.addGuest(guest);
        assertEquals(2, conferenceRoom.numOfGuests());
    }

    @Test
    public void canRemoveGuest(){
        conferenceRoom.addGuest(guest);
        conferenceRoom.removeGuest(guest);
        assertEquals(0, conferenceRoom.numOfGuests());
    }

}
