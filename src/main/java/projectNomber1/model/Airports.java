package projectNomber1.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Builder
public class Airports {

    private int id;
    private String airportName;
    private String city;
    private String country;

}
