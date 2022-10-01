import POJOs.RCBTeam;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import util.ApplicationProperties;
import util.IReporterListeners;
import java.io.File;
import java.io.IOException;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@Listeners(IReporterListeners.class)
public class BaseTest {

    public RCBTeam team = null;

    @BeforeMethod
    public RCBTeam readDataFromTxtFile() {

        String teamName = ApplicationProperties.INSTANCE.getTeamName();
        ObjectMapper mapper = new ObjectMapper();
        try {
            team = mapper.readValue(new File("src/main/java/data/palyers.txt"), RCBTeam.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        assertThat(team.getName(), is(teamName));

        return team;
    }


}
