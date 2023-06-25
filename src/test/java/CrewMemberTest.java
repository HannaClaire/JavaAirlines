import com.codeclan.CabinCrewMember;
import com.codeclan.CrewMember;
import com.codeclan.Rank;
import org.junit.Before;

public class CrewMemberTest {

    CrewMember crewMember;


    @Before
    public void before(){
        crewMember = new CrewMember("Stan", 1, 80, Rank.FIRST_OFFICER);
    }


}
