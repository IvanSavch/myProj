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
    private int departureAirport;
    private Date departureTime;
    private int arrivalAirport;
    private Date arrivalTime;

}
