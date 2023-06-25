import com.codeclan.Pilot;
import com.codeclan.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;


    @Before
    public void before(){
        pilot = new Pilot("Charles", Rank.CAPTAIN, 1, 80, "002003002 B");
    }

    @Test
    public void hasName(){
        assertEquals("Charles", pilot.getName());
    }

    @Test
    public void hasRank(){
        assertEquals(Rank.CAPTAIN, pilot.getRank());
    }

    @Test
    public void hasLicenceNo(){
        assertEquals("002003002 B", pilot.getLicenceNo());
    }

    @Test
    public void isSoberAndCanFlyPlane(){
        assertEquals("ooh god, we're takin' off", pilot.canFlyPlane());
    }


}
