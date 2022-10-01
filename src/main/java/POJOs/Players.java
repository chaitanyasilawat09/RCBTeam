package POJOs;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Setter
@Getter
@ToString
@JsonIgnoreProperties
@AllArgsConstructor
@NoArgsConstructor
public class Players {

        private String name;
        private String country;
        private String role;
        @JsonProperty(value = "price-in-crores")
        private String price;


    }
