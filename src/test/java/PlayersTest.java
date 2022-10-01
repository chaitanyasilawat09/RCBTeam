import POJOs.Players;
import org.testng.annotations.Test;
import util.ApplicationProperties;

import java.util.List;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;

public class PlayersTest extends BaseTest{

    int foreignPlayerCount = ApplicationProperties.INSTANCE.getForeignPlayer();
    int wicketKeeperCount = ApplicationProperties.INSTANCE.getWicketKeeperCount();

    @Test
    public void validateWicketKeeperGreaterThan_1(){
        int count = 0;
        List<Players> playersList = team.getPlayer();
        for(Players players : playersList){
            if (players.getRole().equalsIgnoreCase("Wicket-keeper")){
                count++;
            }
        }
        assertThat("Response not contains at least 1 Wicket keeper",count, is(greaterThanOrEqualTo(wicketKeeperCount)));
    }

    @Test
    public void validateContainsForeignPlayer(){
        int count = 0;
        List<Players> playersList = team.getPlayer();
        for(Players players : playersList){
            if (!((players.getCountry()).equalsIgnoreCase("india"))){
                count++;
            }
        }
        assertThat("Response contains less than 4 Foreign Player",count, is(foreignPlayerCount));
    }

    }



