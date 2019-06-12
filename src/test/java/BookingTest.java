import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    Bedroom bedroom;
    Booking booking;

    @Before
    public void before(){
        bedroom = new Bedroom(1, 2, "single", 50);
        booking = new Booking(bedroom, 7);
    }

    @Test
    public void canGetBedroomNumber(){
        assertEquals(1, booking.getBedroomNumber());
    }

    @Test
    public void canGetNumOfNights(){
        assertEquals(7, booking.getNumOfNights());
    }

    @Test
    public void canCalculateTotalBill(){
        assertEquals(350, booking.calculateTotalBill());
    }

}
