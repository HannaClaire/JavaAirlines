import com.codeclan.CabinCrewMember;
import com.codeclan.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewTest {

    CabinCrewMember cabinCrewMember;

    @Before
    public void before(){
        cabinCrewMember = new CabinCrewMember("Sid", 1, 90, Rank.FLIGHT_ATTENDANT);

    }

    @Test
    public void hasName(){
        assertEquals("Sid", cabinCrewMember.getName());
    }

    @Test
    public void hasRank(){
        assertEquals(Rank.FLIGHT_ATTENDANT, cabinCrewMember.getRank());
    }

    @Test
    public void canRelayMessage(){
        assertEquals("Fasten yer seatbelts, folks!", cabinCrewMember.relayMessage());
    }


}
