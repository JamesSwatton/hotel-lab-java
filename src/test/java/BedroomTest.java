import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    Guest guest;

    @Before
    public void before(){
        bedroom = new Bedroom(1, 2, "double", 50);
        guest =  new Guest("Gary");
    }

    @Test
    public void shouldHaveANumber(){
        assertEquals(1, bedroom.getRoomNumber());
    }

    @Test
    public void shouldHaveCapacity(){
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void shouldHaveAType(){
        assertEquals("double", bedroom.getType());
    }

    @Test
    public void isEmptyWhenCreated(){
        assertEquals(0, bedroom.getNumberOfGuests());
    }

    @Test
    public void canAddGuest(){
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.getNumberOfGuests());
    }

    @Test
    public void cantAddMoreThanCapacity(){
        bedroom.addGuest(guest);
        bedroom.addGuest(guest);
        bedroom.addGuest(guest);
        assertEquals(2, bedroom.getNumberOfGuests());
    }

    @Test
    public void canRemoveGuest(){
        bedroom.addGuest(guest);
        bedroom.removeGuest(guest);
        assertEquals(0, bedroom.getNumberOfGuests());
    }

    @Test
    public void cantRemoveMoreGuestsThanExist(){
        bedroom.removeGuest(guest);
        assertEquals(0, bedroom.getNumberOfGuests());
    }

    @Test
    public void hasANightlyRate(){
        assertEquals(50, bedroom.getNightlyRate());
    }

    @Test
    public void checkIfEmpty(){
        assertEquals(true, bedroom.isEmpty());
    }

}
