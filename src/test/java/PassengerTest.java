import org.junit.Before;

import com.codeclan.Passenger;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;
    Passenger passenger1;


    @Before
    public void before(){
        passenger = new Passenger("Terry", 1, 80);
        passenger1 = new Passenger("Jonny", 6, 80);
    }

    @Test
    public void hasName(){
        assertEquals("Terry", passenger.getName());
    }

    @Test
    public void hasNoOfBags(){
        assertEquals(1, passenger.getNoOfBags());
    }

    @Test
    public void hasHappyPassenger(){
        assertEquals("Looking forward to a cheeky vodders in the air like i just don't care, woo", passenger1.passengerHasTemper());
    }

    @Test
    public void passengerHasWeight(){
        assertEquals(80, passenger.getWeight());
    }





}
