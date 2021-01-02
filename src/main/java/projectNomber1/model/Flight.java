package projectNomber1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Flight {

    private int id;
    private Airports departureAirport;
    private LocalDateTime departureTime;
    private Airports arrivalAirport;
    private LocalDateTime arrivalTime;

}
