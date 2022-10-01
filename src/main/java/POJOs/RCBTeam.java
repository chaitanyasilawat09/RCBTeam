package POJOs;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import java.util.List;

@Setter
@Getter
@ToString
@JsonIgnoreProperties
@AllArgsConstructor
@NoArgsConstructor
public class RCBTeam {

    private String name;
    private String location;
    private List<Players> player;

}
