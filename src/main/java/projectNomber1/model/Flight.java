package projectNomber1.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.sql.Date;
@Data
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Builder
public class Flight {


    private int id;
    private String departureAirport;
    private Date departureTime;
    private String arrivalAirport;
    private Date arrivalTime;

}
