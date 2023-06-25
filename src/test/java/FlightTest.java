import com.codeclan.*;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

import static javax.swing.UIManager.put;
import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Pilot pilot;
    Passenger passenger;
    CabinCrewMember cabinCrewMember;




    @Before
    public void before(){
        CabinCrewMember cabinCrew1 = new CabinCrewMember("Jenna", 1, 89, Rank.FLIGHT_ATTENDANT);
        CabinCrewMember cabinCrew2 = new CabinCrewMember("Cathy", 1,70, Rank.FLIGHT_ATTENDANT);
        CabinCrewMember cabinCrew3 = new CabinCrewMember("Toby", 1, 90, Rank.FLIGHT_ATTENDANT);
        CabinCrewMember cabinCrew4 = new CabinCrewMember("Anna", 1, 97, Rank.FLIGHT_ATTENDANT);
        ArrayList<CabinCrewMember> cabinCrew = new ArrayList<>();
        cabinCrew.add(cabinCrew1);
        cabinCrew.add(cabinCrew2);
        cabinCrew.add(cabinCrew3);
        cabinCrew.add(cabinCrew4);

        Passenger passenger1 = new Passenger("Rachel", 1, 90);
        Passenger passenger2 = new Passenger("Karen", 2, 60);
        Passenger passenger3 = new Passenger("Elliot", 0, 80);
        Passenger passenger4 = new Passenger("Bruce", 1,60);
        Passenger passenger5 = new Passenger("Briony", 3,95);
        ArrayList<Passenger> passengers = new ArrayList<>();
        passengers.add(passenger1);
        passengers.add(passenger2);
        passengers.add(passenger3);
        passengers.add(passenger4);
        passengers.add(passenger5);

        pilot = new Pilot("Charles", Rank.CAPTAIN, 1, 80, "2002002 F");
        flight = new Flight(true, cabinCrew, passengers, "FR756", "LDN", "EDI", "19:20", 45000);
    }
        //only need one instance of a flight for the test

    @Test
    public void flightHasPilot(){
        assertEquals("Charles", pilot.getName());
    }
//not sure if above is correct as pilot is object, and name is just name - not sure how I would get object?

    @Test
    public void hasFlightNum(){
        assertEquals("FR756", flight.getFlightNum());
    }

    @Test
    public void updateFlightNum(){
        flight.setFlightNum("FR746");
        assertEquals("FR746", flight.getFlightNum());
    }

    @Test
    public void hasDestination(){
        assertEquals("LDN", flight.getDestination());
    }

    @Test
    public void hasDepAirport(){
        assertEquals("EDI", flight.getDepAirport());
    }

    @Test
    public void hasDepTime(){
        assertEquals("19:20", flight.getDepTime());
    }

    @Test
    public void hasTotalWeightAllowance(){
        assertEquals(45000, flight.getTotalWeightAllowance());
    }




    @Test
    public void numOfAvailableSeats(){
//        int available_seats = flight.returnAvailableSeats();
        assertEquals(295, flight.returnAvailableSeats());
    }

    @Test
    public void canBookAPassengerIfSeats(){
        int initialAvailableSeats = flight.returnAvailableSeats();  // outcome: 295
        int expectedBookingOutcome = initialAvailableSeats > 0 ? 1 : 0; //outcome:1 confirms seats are available
        int seatsAvailable = flight.bookPassengersIfAvailableSeats(); // attempts to book passenger onto plane

        assertEquals(294, seatsAvailable);
        assertEquals(1, expectedBookingOutcome);
        assertEquals(6, flight.getBookedPassengersCount());

    }


}
