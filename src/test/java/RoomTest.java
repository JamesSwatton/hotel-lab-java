import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;
    Guest guest;

    @Before
    public void before(){
        room = new Room(2);
        guest = new Guest("James");
    }

    @Test
    public void canGetCapacity(){
        assertEquals(2, room.getCapacity());
    }

    @Test
    public void canAddGuestToRoom(){
        room.addGuest(guest);
        assertEquals(1, room.getNumberOfGuests());
    }



}
